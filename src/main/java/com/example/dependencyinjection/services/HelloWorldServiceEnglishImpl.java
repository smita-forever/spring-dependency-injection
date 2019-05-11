package com.example.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author smita
 *
 */
@Component
@Profile({"default", "english"})
public class HelloWorldServiceEnglishImpl implements HelloWorldService {

	@Override
	public String getGreeting() {
		return "Hello World";
	}

}
