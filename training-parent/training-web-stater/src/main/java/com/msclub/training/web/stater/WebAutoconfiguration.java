package com.msclub.training.web.stater;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.msclub.training.web.stater.exception.CustomerExceptionHandler;

@Configuration
public class WebAutoconfiguration {

	@Bean
	public CustomerExceptionHandler customerExceptionHandler(){
		return new CustomerExceptionHandler();
	}
	
}
