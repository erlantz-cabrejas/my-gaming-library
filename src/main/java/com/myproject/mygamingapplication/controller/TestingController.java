package com.myproject.mygamingapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {
    @GetMapping("/test")
    public String index() {
        return "Testing API call";
    }

}
