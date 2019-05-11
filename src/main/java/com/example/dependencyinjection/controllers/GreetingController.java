package com.example.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.dependencyinjection.services.HelloWorldService;

/**
 * @author smita
 *
 */
@Controller
public class GreetingController {

	private HelloWorldService helloWorldService;
	
	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	public String sayHello() {
		String greeting = helloWorldService.getGreeting();
		System.out.println(greeting);
		return greeting;
	}
}
