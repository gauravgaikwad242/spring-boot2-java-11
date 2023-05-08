package com.example.springidea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicRestController {
    @GetMapping
    public String handler(){
        return "app running!!";
    }
}
