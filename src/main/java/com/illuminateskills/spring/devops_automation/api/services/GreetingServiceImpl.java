package com.illuminateskills.spring.devops_automation.api.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {

        return "Hello from Greeting Service";
    }
}
