package com.illuminateskills.spring.devops_automation.api.controllers;

import com.illuminateskills.spring.devops_automation.api.services.GreetingService;

public class PropertyInjectionController {

    public GreetingService greetingService;

    public String getGreeting(){

        return greetingService.sayGreeting();
    }
}
