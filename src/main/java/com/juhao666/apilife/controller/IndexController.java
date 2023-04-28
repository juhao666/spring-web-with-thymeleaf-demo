package com.juhao666.apilife.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @GetMapping(value = {"/index"})
    public String home(HttpSession session, Model model) {

        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        String indexPV = ops.get("/index");
        String dataPV = ops.get("/tables/data");
        model.addAttribute("indexPV", indexPV);
        model.addAttribute("dataPV", dataPV);
        return "index";
//        User user = (User) session.getAttribute("loginUser");
//        if (user != null)
//            return "index";
//        else {
//            model.addAttribute("msg", "please sign in...");
//            return "pages-login";
//        }
    }
}

