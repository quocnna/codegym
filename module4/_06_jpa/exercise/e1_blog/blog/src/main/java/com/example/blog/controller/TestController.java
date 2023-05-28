package com.example.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class TestController {
    @GetMapping
    public String home(){
        return "test";
    }
}
