package com.snowflake.framework.annotation;

import java.lang.annotation.*;

/**
 * 该注解表示一个类为restful controller类。
 *
 * @author lts
 * Create time 2022/3/8
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface Restful {
}
