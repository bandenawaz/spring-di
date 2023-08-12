package com.illuminateskills.spring.devops_automation.api;

import com.illuminateskills.spring.devops_automation.api.controllers.MyController;
import com.illuminateskills.spring.devops_automation.api.controllers.PropertyInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("---------------- Property Injection ----------------");

		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getGreeting());
	}

}
