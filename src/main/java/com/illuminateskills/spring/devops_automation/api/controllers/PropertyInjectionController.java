package com.illuminateskills.spring.devops_automation.api.controllers;

import com.illuminateskills.spring.devops_automation.api.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){

        return greetingService.sayGreeting();
    }
}
