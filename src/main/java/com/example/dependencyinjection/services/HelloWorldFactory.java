package com.example.dependencyinjection.services;

import org.springframework.stereotype.Component;

/**
 * @author smita
 *
 */
@Component
public class HelloWorldFactory {

	public HelloWorldService getHelloWorldService(String language) {
		HelloWorldService service = null;
		switch(language) {
		
			case "en": {
				service = new HelloWorldServiceEnglishImpl();
				break;
			}
			
			case "es" : {
				service = new HelloWorldServiceSpanishImpl();
				break;
			}
			
			case "de": {
				service = new HelloWorldServiceGermanImpl();
				break;
			}
			
			default:{
				service= new HelloWorldServiceEnglishImpl();
				break;
			}
				
		}
		return service;
	}
}
