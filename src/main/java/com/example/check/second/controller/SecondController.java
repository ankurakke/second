package com.example.check.second.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    
    @GetMapping(path ="/")
    public String showme() {
        return "Show this";
    }

}
