package com.snowflake.framework.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import java.io.IOException;

/**
 * @author lts
 * Create time 2022/3/8
 */
public class JettyServlet extends AbstractHandler {

    public JettyServlet(HttpServletHandler servletHandler) {

    }

    @Override
    public void handle(String uri,
                       Request baseRequest,
                       HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException {

    }
}
