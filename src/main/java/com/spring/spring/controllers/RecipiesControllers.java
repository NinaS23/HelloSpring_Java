package com.spring.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RecipiesControllers {

    @GetMapping("/")

    public String HelloSpring(){
        return "olá,spring!";
    }
    
}
