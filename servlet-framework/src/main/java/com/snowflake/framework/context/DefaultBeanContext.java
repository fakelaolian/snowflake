package com.snowflake.framework.context;

import com.snowflake.framework.annotation.Component;
import com.snowflake.framework.annotation.Install;
import com.snowflake.framework.exception.IllegalInstallClassException;
import com.snowflake.framework.utils.ClassUtils;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lts
 * Create time 2022/3/8
 */
@Slf4j
public class DefaultBeanContext implements BeanContext {

    /**
     * bean map.
     */
    private final Map<Class<?>, Object> _beans = new HashMap<>();

    @Override
    public void addBean(Object object) {
        _beans.put(object.getClass(), object);
        _process(object);
    }

    /**
     * 处理bean对象，判断有没有需要注入的bean
     */
    void _process(Object object) {
        try {
            Class<?> _class = object.getClass();
            var installFields = ClassUtils.getFieldsByAnnotated(_class, Install.class);

            for (Field installField : installFields) {
                installField.setAccessible(true);

                // 如果field没有被赋值，那么就从容器中查询field对应的对象
                if (installField.get(object) == null) {
                    var fieldClass = installField.getType();

                    // 从容器中查询,如果没有就实例化
                    Object filedObject = getBean(fieldClass);
                    if (filedObject == null) {
                        _instance(object, installField);
                    } else {
                        installField.set(object, filedObject);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 实例化bean
     */
    void _instance(Object object, Field field) {
        Class<?> _class = field.getType();
        try {
            // 判断类是否注解了@Component, 没注解Component的类不允许注入。
            if (!_class.isAnnotationPresent(Component.class)) {
                throw new IllegalInstallClassException("被注入的类需要注解Component，否则不允许注入。");
            }

            Object beanObject = ClassUtils.newInstance(_class);
            field.set(object, beanObject);
            // 回调，递归搜索所有要被注入的Bean
            addBean(beanObject);
        } catch (Exception e) {
            log.error("在{}类中注入对象{}时失败，原因：创建Bean失败。",
                    object.getClass().getName(), _class.getName(), e);
        }
    }

    @Override
    public Object getBean(Class<?> beanClass) {
        return _beans.get(beanClass);
    }

}
