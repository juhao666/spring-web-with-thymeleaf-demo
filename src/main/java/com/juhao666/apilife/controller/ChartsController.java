package com.juhao666.apilife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/charts")
public class ChartsController {

    @GetMapping("/apexcharts")
    public String apexcharts() {
        return "charts-apexcharts";
    }

    @GetMapping("/chartjs")
    public String chartjs() {
        return "charts-chartjs";
    }

    @GetMapping("/echarts")
    public String echarts() {
        return "charts-echarts";
    }
}
