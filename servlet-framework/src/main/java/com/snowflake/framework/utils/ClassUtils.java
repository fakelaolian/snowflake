package com.snowflake.framework.utils;

import com.snowflake.framework.annotation.Install;

import java.io.FileDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 类工具
 *
 * @author lts
 * Create time 2022/3/8
 */
public class ClassUtils {


    /**
     * 创建一个实例。
     */
    public static Object newInstance(Class<?> _class) throws Exception {
        Constructor<?> constructor = _class.getDeclaredConstructor();
        return constructor.newInstance();
    }

    /**
     * 创建一个实例并传递构造函数参数。
     *
     * @param parametersType  构造函数参数类型。
     * @param parametersValue 构造函数参数值。
     */
    public static Object newInstance(Class<?> _class, Class<?>[] parametersType,
                                     Object... parametersValue) throws Exception {
        Constructor<?> constructor = null;
        constructor = _class.getConstructor(parametersType);
        return constructor.newInstance(parametersValue);
    }

    /**
     * 获取带有指定注解的类成员
     */
    public static List<Field> getFieldsByAnnotated(Class<?> _class, Class<? extends Annotation> annotation) {
        List<Field> fields = getFields(_class);
        return fields.stream().filter(v -> v.isAnnotationPresent(annotation))
                .collect(Collectors.toList());
    }

    /**
     * 获取所有成员对象，包括父类的
     */
    public static List<Field> getFields(Class<?> _class) {
        List<Field> fields = Lists.newArrayList();

        if (_class == null)
            return fields;

        Field[] declaredFields = _class.getDeclaredFields();
        fields.addAll(Arrays.asList(declaredFields));

        // 循环查询父类对象
        while ((_class = _class.getSuperclass()) != Object.class)
            fields.addAll(Arrays.asList(_class.getDeclaredFields()));

        fields = fields.stream().filter(v -> !v.getName().equals("this$0")).collect(Collectors.toList());

        return fields;
    }

}
