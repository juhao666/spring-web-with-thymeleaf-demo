package com.juhao666.apilife.controller;

import com.juhao666.apilife.model.Emp;
import com.juhao666.apilife.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tables")
public class TablesController {

//    @GetMapping("/data")
//    public String data(Model model) {
//        //todo: the data should be fetched from DB.
//        List<Employee> employees = Arrays.asList(
//                new Employee("Tom", "CEO", 30, new Date(1993 - 1900, Calendar.JANUARY, 1)),
//                new Employee("Sky", "CIO", 40, new Date(1983 - 1900, Calendar.DECEMBER, 12)),
//                new Employee("Jim", "CTO", 32, new Date(1995 - 1900, Calendar.JUNE, 11)),
//                new Employee("Evo", "CDO", 35, new Date(1989 - 1900, Calendar.AUGUST, 1)));
//        model.addAttribute("emps", employees);
//        //int i = 1 / 0; // simulate 500 error here
//        //int i = 1 / 0; // simulate GlobalExceptionHandler
//        return "tables-data";
//    }

    @GetMapping("/general")
    public String general() {
        return "tables-general";
    }


    @Autowired
    UserService service;

    @GetMapping("/data")
    public String data(Model model) {
        //fetch data from DB.
        List<Emp> employees = service.list();

        model.addAttribute("emps", employees);
        //todo 分頁控制，不起作用
        //model.addAttribute("start", 1);
        //model.addAttribute("end", 10);
        //model.addAttribute("rows", 100);
        return "tables-data";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id) {
        service.removeById(id);
        return "redirect:/tables/data";
    }
}
