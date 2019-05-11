package com.example.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author smita
 *
 */
@Component
@Profile("spanish")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {

	@Override
	public String getGreeting() {
		return "Hola Mundo";
	}

}
