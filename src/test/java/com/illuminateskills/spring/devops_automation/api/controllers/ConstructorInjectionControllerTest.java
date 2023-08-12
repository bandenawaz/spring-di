package com.illuminateskills.spring.devops_automation.api.controllers;

import com.illuminateskills.spring.devops_automation.api.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectionControllerTest {

    ConstructorInjectionController controller;;

    @BeforeEach
    void setUp(){

        controller = new ConstructorInjectionController(new GreetingServiceImpl());

    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}