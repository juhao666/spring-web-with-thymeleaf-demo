package com.juhao666.apilife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SQLDemoController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/sql")
    public String count() {
        int count = jdbcTemplate.queryForObject("select count(*) from emp", Integer.class);
        return count + " records";
    }
}
