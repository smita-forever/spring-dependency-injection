package com.example.dependencyinjection.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.dependencyinjection.services.HelloWorldFactory;
import com.example.dependencyinjection.services.HelloWorldService;

/**
 * @author smita
 *
 */
@Configuration
public class HelloConfig {
	
	@Autowired
	public HelloWorldFactory helloWorldFactory;
	
	@Bean
	@Profile({"default", "english"})
	public HelloWorldService getHelloWorldServiceEnglish(HelloWorldFactory factory) {
		return factory.getHelloWorldService("en");
	}
	
	@Bean
	@Profile("spanish")
	public HelloWorldService getHelloWorldServiceSpanish(HelloWorldFactory factory) {
		return factory.getHelloWorldService("es");
	}
	
	@Bean
	@Profile("german")
	public HelloWorldService getHelloWorldServiceGerman(HelloWorldFactory factory) {
		return factory.getHelloWorldService("de");
	}


}
