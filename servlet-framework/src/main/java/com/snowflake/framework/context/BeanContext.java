package com.snowflake.framework.context;

/**
 * bean容器
 *
 * @author lts
 * Create time 2022/3/8
 */
public interface BeanContext {

    /**
     * 添加一个新的Bean
     *
     * @param object bean对象
     */
    void addBean(Object object);

    /**
     * 根据类查询对应的bean
     */
    Object getBean(Class<?> beanClass);

}
