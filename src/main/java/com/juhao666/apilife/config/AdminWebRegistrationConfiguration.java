package com.juhao666.apilife.config;

import com.juhao666.apilife.servlet.AdminFilter;
import com.juhao666.apilife.servlet.AdminServlet;
import com.juhao666.apilife.servlet.AdminServletContextListener;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration(proxyBeanMethods = true) //始终保证所有的依赖的组件是单实例的，比如AdminServlet。
public class AdminWebRegistrationConfiguration {

    @Bean
    public ServletRegistrationBean adminServlet() {
        AdminServlet adminServlet = new AdminServlet();
        return new ServletRegistrationBean(adminServlet, "/juhao");
    }

    @Bean
    public FilterRegistrationBean adminFilter() {
        AdminFilter adminFilter = new AdminFilter();
        //return new FilterRegistrationBean(adminFilter, adminServlet());
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(adminFilter);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/juhao", "/assets/css/*"));
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean adminListener() {
        AdminServletContextListener adminServletContextListener = new AdminServletContextListener();
        return new ServletListenerRegistrationBean(adminServletContextListener);

    }
}
