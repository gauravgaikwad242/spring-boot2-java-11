package com.example.springidea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class PublicRestController {
    @GetMapping
    public String handler(){
        return "app running!!";
    }
    @GetMapping("/all")
    public String getAll(){
        return "app all running!!";
    }
    @GetMapping("/root")
    public String root(){
        return "app root running!!";
    }
}
