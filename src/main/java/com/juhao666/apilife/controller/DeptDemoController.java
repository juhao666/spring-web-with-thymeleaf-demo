package com.juhao666.apilife.controller;

import com.juhao666.apilife.model.Dept;
import com.juhao666.apilife.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeptDemoController {


    @Autowired
    DeptService service;

    @ResponseBody
    @GetMapping("/dept")
    public Dept getDept(@RequestParam("id") int id) {
        return service.getDept(id);
    }

    @ResponseBody
    @PostMapping("/save")
    public Dept save(Dept dept) {
        service.save(dept);
        return dept;
    }
}
