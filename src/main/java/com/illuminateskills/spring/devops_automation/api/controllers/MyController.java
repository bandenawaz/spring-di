package com.illuminateskills.spring.devops_automation.api.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hey there!");

        return "Hello there!";
    }
}
