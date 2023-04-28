package com.juhao666.apilife.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

//@Configuration
public class DruidDataSourceConfiguration {

//    @ConfigurationProperties("spring.datasource.druid")
//    @Bean
    public DataSource druid() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        //dataSource.setFilters("stat,wall");
        return dataSource;
    }

    /**
     * Druid monitoring
     *
     * @return StatViewServlet
     */
//    @Bean
    public ServletRegistrationBean statViewServlet() {
        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean servletRegistrationBean;
        servletRegistrationBean = new ServletRegistrationBean<StatViewServlet>(statViewServlet, "/druid/*");
        servletRegistrationBean.addInitParameter("loginUsername","admin");
        servletRegistrationBean.addInitParameter("loginPassword","admin");
        return servletRegistrationBean;
    }

//    @Bean
    public FilterRegistrationBean webStatFilter() {
        WebStatFilter webStatFilter = new WebStatFilter();
        FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean(webStatFilter);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*,/components/*");
        return filterRegistrationBean;
    }
}


