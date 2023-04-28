package com.juhao666.apilife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/components")
public class ComponentsController {

    @GetMapping("/accordion")
    public String accordion() {
        return "components-accordion";
    }

    @GetMapping("/alerts")
    public String alerts() {
        return "components-alerts";
    }

    @GetMapping("/badges")
    public String badges() {
        return "components-badges";
    }

    @GetMapping("/breadcrumbs")
    public String breadcrumbs() {
        return "components-breadcrumbs";
    }

    @GetMapping("/buttons")
    public String buttons() {
        return "components-buttons";
    }

    @GetMapping("/cards")
    public String cards() {
        return "components-cards";
    }

    @GetMapping("/carousel")
    public String carousel() {
        return "components-carousel";
    }

    @GetMapping("/list-group")
    public String listGroup() {
        return "components-list-group";
    }

    @GetMapping("/modal")
    public String modal() {
        return "components-modal";
    }

    @GetMapping("/pagination")
    public String pagination() {
        return "components-pagination";
    }

    @GetMapping("/progress")
    public String progress() {
        return "components-progress";
    }

    @GetMapping("/spinners")
    public String spinners() {
        return "components-spinners";
    }

    @GetMapping("/tabs")
    public String tabs() {
        return "components-tabs";
    }


    @GetMapping("/tooltips")
    public String tooltips() {
        return "components-tooltips";
    }
}
