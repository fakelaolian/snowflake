package com.snowflake.framework.annotation;

import java.lang.annotation.*;

/**
 * 注入bean
 *
 * @author lts
 * Create time 2022/3/8
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Documented
public @interface Install {

    /**
     * 这个属性为true的话表示这个属性的必须注入的，不能为null。
     * 默认为true，如果要非必须的话设置为false即可。
     */
    boolean required() default true;

}
