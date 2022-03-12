package com.snowflake.framework.servlet;

import com.snowflake.framework.annotation.Component;
import com.snowflake.framework.annotation.Install;
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
@Component
public class JettyServlet extends AbstractHandler {

    @Install
    private HttpServletHandler _httpServletHandler;

    @Override
    public void handle(String uri,
                       Request baseRequest,
                       HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException {
        _httpServletHandler.doHandle(uri, request, response);
    }
}
