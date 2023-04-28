package com.juhao666.apilife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/icons")
public class IconsController {

    @GetMapping("/bootstrap")
    public String bootstrap() {
        return "icons-bootstrap";
    }

    @GetMapping("/remix")
    public String remix() {
        return "icons-remix";
    }

    @GetMapping("/boxicons")
    public String boxicons() {
        return "icons-boxicons";
    }

    @GetMapping("/login")
    public String  login() {
        return "pages-login";
    }

}
