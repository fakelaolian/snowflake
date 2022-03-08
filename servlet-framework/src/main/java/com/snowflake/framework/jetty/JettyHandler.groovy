package com.snowflake.framework.jetty

import jakarta.servlet.ServletException
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.eclipse.jetty.server.Request
import org.eclipse.jetty.server.handler.AbstractHandler

/**
 * @author lts
 * ----------------------------
 * Create time 2022/3/7
 */
class JettyHandler extends AbstractHandler {

    @Override
    void handle(String s,
                Request request,
                HttpServletRequest httpServletRequest,
                HttpServletResponse httpServletResponse)
            throws IOException, ServletException {


    }
}
