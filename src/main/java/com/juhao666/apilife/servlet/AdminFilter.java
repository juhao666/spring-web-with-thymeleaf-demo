package com.juhao666.apilife.servlet;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
//@WebFilter(urlPatterns = {"/assets/css/*","/assets/img/*"}) //等同于AdminWebRegistrationConfiguration
public class AdminFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //Filter.super.init(filterConfig);
        log.info("admin filter init...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("admin filter doing...");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        //Filter.super.destroy();
        log.info("admin filter destroy...");
    }
}
