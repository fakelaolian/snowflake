package com.snowflake.framework;

import com.snowflake.framework.context.SnowflakeApplicationContext;

/**
 * Snowflake应用启动器
 *
 * @author lts
 * Create time 2022/3/7
 */
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
        var context = new SnowflakeApplicationContext();
    }

}
