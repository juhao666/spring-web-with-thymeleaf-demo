package com.juhao666.apilife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages")
public class PagesController {

    @GetMapping("/blank")
    public String blank() {
        return "pages-blank";
    }

    @GetMapping("/contact")
    public String contact() {
        return "pages-contact";
    }

    @GetMapping("/error")
    public String error() {
        return "pages-error-404";
    }

    @GetMapping("/faq")
    public String faq() {
        return "pages-faq";
    }

    @GetMapping("/login")
    public String login() {
        return "pages-login";
    }

    @GetMapping("/register")
    public String register() {
        return "pages-register";
    }

    @GetMapping("/error/500")
    public String error500() {
        return "error/5xx";
    }

}
