package com.juhao666.apilife.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import lombok.extern.slf4j.Slf4j;

@Slf4j
//@WebListener//等同于AdminWebRegistrationConfiguration
public class AdminServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("admin servlet listener initialized completed...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("admin servlet listener destroyed completed...");
    }
}
