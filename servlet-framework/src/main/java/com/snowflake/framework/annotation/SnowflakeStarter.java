package com.snowflake.framework.annotation;

import java.lang.annotation.*;

/**
 * 配置启动器
 *
 * @author lts
 * Create time 2022/3/8
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface SnowflakeStarter {

    /**
     * 扫描其他jar包或者其他模块中的组件列表
     */
    String[] packages() default "";

}
