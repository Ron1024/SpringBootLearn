package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping(value = "/sayHello")
    public  String sayHello(){
        return "Hello world,Hello Spring Boot";
    }
}
