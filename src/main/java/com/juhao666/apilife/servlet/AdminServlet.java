package com.juhao666.apilife.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * 范根/juhao不经过拦截器
 * 启动类类面需要加上@ServletComponentScan(basePackages = "com.juhao666.apilife")
 */
//@WebServlet(urlPatterns = "/juhao")//等同于AdminWebRegistrationConfiguration
public class AdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("juhao04");
    }
}
