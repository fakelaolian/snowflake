package com.snowflake.framework;

import com.snowflake.framework.annotation.SnowflakeStarter;
import com.snowflake.framework.context.SnowflakeApplicationContext;
import com.snowflake.framework.server.JettyServer;
import com.snowflake.framework.server.ServerConfig;

import javax.annotation.processing.AbstractProcessor;

/**
 * Snowflake应用启动器
 *
 * @author lts
 * Create time 2022/3/7
 */
@SnowflakeStarter
public class SnowflakeApplication {

    /**
     * 全局上下文
     */
    private SnowflakeApplicationContext _context;

    /**
     * 启动应用
     *
     * @param startClass 启动类
     * @param args       启动参数
     */
    public static void run(Class<?> startClass, String... args) {
        // 创建全局上下文
        var context = new SnowflakeApplicationContext();

        // 配置Jetty服务
        var serverConfig = new ServerConfig();
        serverConfig.setPort(8080);
        var jettyServer = new JettyServer(context, serverConfig);

        // 启动Jetty服务
        jettyServer.startServer();
    }

    public static void main(String[] args) {
        run(SnowflakeApplication.class, args);
    }

}
