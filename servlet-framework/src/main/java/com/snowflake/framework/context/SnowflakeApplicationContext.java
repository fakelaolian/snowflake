package com.snowflake.framework.context;

import com.snowflake.framework.annotation.Install;
import com.snowflake.framework.servlet.CoreServletHandler;
import com.snowflake.framework.servlet.JettyServlet;

/**
 * 全局上下文
 *
 * @author lts
 * Create time 2022/3/8
 */
public class SnowflakeApplicationContext {

    @Install
    private ServletRequestAttribute servletRequestAttribute;

    // bean容器上下文
    private final BeanContext beanContext;

    public SnowflakeApplicationContext() {
        beanContext = new DefaultBeanContext();
        beanContext.addBean(this);
        beanContext.addBean(new CoreServletHandler());
        beanContext.addBean(new JettyServlet());
    }

    public void addBean(Object object) {
        beanContext.addBean(object);
    }

}
