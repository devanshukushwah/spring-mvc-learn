package com.springmvc.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    String getHome() {
        return "home";
    }

    @RequestMapping("/add")
    ModelAndView add(@RequestParam int num1, @RequestParam int num2) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("result");
        int num3 = num1 + num2;
        modelAndView.addObject("num3", num3);
        return modelAndView;
    }
}
