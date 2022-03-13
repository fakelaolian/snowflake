package com.snowflake.framework.context;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author lts
 * Create time 2022/3/12
 */
public non-sealed class DefaultBeanFactory implements BeanFactory {

    /**
     * 存放bean的map
     */
    private final Map<Class<?>, Object> _beanMap = Maps.newHashMap();

    @Override
    public void submit(Object object) {

    }

    @Override
    public void submit(String name, Object object) {

    }

    @Override
    public Object getBean(Class<?> _class) {
        if (_class == null)
            return null;

        return _beanMap.get(_class);
    }

}
