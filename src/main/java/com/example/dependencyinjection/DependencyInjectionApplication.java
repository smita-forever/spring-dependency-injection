package com.example.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.dependencyinjection.controllers.GreetingController;

/**
 * @author smita
 *
 */
@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);
		GreetingController controller = (GreetingController) applicationContext.getBean("greetingController");

        controller.sayHello();
	}

}
