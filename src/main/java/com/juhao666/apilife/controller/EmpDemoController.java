package com.juhao666.apilife.controller;

import com.juhao666.apilife.model.Emp;
import com.juhao666.apilife.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmpDemoController {
    @Autowired
    EmpService service;

    @ResponseBody
    @GetMapping("/emp")
    public Emp getEmp(@RequestParam("id") String id) {
        return service.getEmp(id);
    }
}
