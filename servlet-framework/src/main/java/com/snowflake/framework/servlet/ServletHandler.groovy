package com.snowflake.framework.servlet

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * @author lts
 * ----------------------------
 * Create time 2022/3/8
 */
interface ServletHandler {

    /**
     * servlet初始化
     */
    void inti()

    /**
     * servlet处理器
     *
     * @param uri 请求地址
     * @param request 请求对象
     * @param response 响应对象
     */
    void handler(String uri, HttpServletRequest request, HttpServletResponse response)

}