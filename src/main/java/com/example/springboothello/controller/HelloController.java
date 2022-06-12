package com.example.springboothello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
    }


    @GetMapping("/hello1")
    public String hello1(){
        return "hello world!";
    }

    @GetMapping("/hello2")
    public String hello2(){
        return "hello world!";
    }
}
