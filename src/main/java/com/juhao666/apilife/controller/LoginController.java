package com.juhao666.apilife.controller;

import com.juhao666.apilife.model.User;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

@Controller
public class LoginController {

    @GetMapping(value = {"/", "/login"})
    public String login() {
        return "pages-login";
    }

    @PostMapping("/login")
    public String login(User user, HttpSession session) {
        if ((!StringUtils.isEmpty(user.getUsername())) && "123456".equalsIgnoreCase(user.getPassword())) {
            session.setAttribute("loginUser", user);
            return "redirect:/index";
        } else {
            return "pages-login";
        }
    }
}


