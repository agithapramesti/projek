package com.example.Project.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }
    @RequestMapping("/home")
    public String homee(){
        return "home";
    }
}
