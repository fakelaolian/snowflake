package com.snowflake.framework.servlet;

import com.snowflake.framework.annotation.Component;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author lts
 * Create time 2022/3/8
 */
@Component
public final class CoreServletHandler implements HttpServletHandler {

    @Override
    public void init() {

    }

    @Override
    public void doHandle(String uri, HttpServletRequest request, HttpServletResponse response) {
    }

}
