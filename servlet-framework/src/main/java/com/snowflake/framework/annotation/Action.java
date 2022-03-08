package com.snowflake.framework.annotation;

import java.lang.annotation.*;

/**
 * @author lts
 * Create time 2022/3/8
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface Action {

    /**
     * 映射路径
     */
    String path();

}
