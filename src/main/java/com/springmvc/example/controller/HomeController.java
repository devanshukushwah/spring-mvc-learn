package com.springmvc.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    String getHome() {
        return "home";
    }

    @RequestMapping("/add")
    String add(@RequestParam int num1, @RequestParam int num2, Model m) {
        int num3 = num1 + num2;
        m.addAttribute("num3", num3);
        return "result";
    }
}
