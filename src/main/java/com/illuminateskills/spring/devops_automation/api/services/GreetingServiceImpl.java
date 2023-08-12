package com.illuminateskills.spring.devops_automation.api.services;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {

        return "Hello from Greeting Service";
    }
}
