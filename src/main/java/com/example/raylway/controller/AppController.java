package com.example.raylway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {


    @GetMapping("/name")
    public String getName(){
        return "Johan Sebastian Garcia Martinez";
    }
}
