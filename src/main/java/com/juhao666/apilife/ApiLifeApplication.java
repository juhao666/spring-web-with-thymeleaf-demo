package com.juhao666.apilife;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.juhao666.apilife")
@MapperScan("com.juhao666.apilife.mapper")
public class ApiLifeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiLifeApplication.class, args);
    }

}
