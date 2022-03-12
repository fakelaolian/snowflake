package com.snowflake.framework.servlet;

import com.snowflake.framework.annotation.Component;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author lts
 * Create time 2022/3/8
 */
public sealed interface HttpServletHandler permits CoreServletHandler {

    /**
     * 初始化
     */
    void init();

    /**
     * 处理请求
     *
     * @param uri      请求接口
     * @param request  请求对象
     * @param response 响应对象
     */
    void doHandle(String uri, HttpServletRequest request, HttpServletResponse response);

}
