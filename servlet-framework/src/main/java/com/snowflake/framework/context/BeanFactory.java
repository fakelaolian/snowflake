package com.snowflake.framework.context;

/**
 * Bean容器
 *
 * @author lts
 * Create time 2022/3/12
 */
public sealed interface BeanFactory permits DefaultBeanFactory {

    /**
     * 提交需要被管理的bean对象, 这个函数会根据类的接口以及类本身对象作为获取
     * bean的key；
     *
     * @param object bean对象
     */
    void submit(Object object);


    /**
     * 这个提交函数和 #submit(Object) 函数的作用是一样的，只是多了
     * 一个name去标识这个bean；
     *
     * @param name   bean名称
     * @param object bean对象
     */
    void submit(String name, Object object);

    /**
     * 根据类或接口获取Bean
     * @param _class 类对象或接口
     */
    Object getBean(Class<?> _class);

}
