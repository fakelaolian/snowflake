package com.snowflake.framework.context;

import com.snowflake.framework.annotation.Install;
import com.snowflake.framework.server.JettyServer;

/**
 * 全局上下文
 *
 * @author lts
 * Create time 2022/3/8
 */
public class SnowflakeApplicationContext {

    private BeanContext beanContext;
    private JettyServer jettyServer;
    private ServletRequestAttribute servletRequestAttribute;

}
