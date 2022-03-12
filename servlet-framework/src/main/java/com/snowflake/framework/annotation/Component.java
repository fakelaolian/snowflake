package com.snowflake.framework.annotation;

import java.lang.annotation.*;

/**
 * 表示类是一个可用的Bean组件，没有这个注解不能注入。
 * 
 * @author lts
 * Create time 2022/3/8
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface Component {
}
