package com.illuminateskills.spring.devops_automation.api.controllers;

import com.illuminateskills.spring.devops_automation.api.services.GreetingService;

public class ConstructorInjectionController {

    private final GreetingService greetingService;;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){

        return greetingService.sayGreeting();
    }
}
