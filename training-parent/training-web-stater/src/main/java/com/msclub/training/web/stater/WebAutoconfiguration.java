package com.msclub.training.web.stater;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.msclub.training.web.stater.exception.CustomerExceptionHandler;
import com.msclub.training.web.stater.util.RestClientUtil;

@Configuration
public class WebAutoconfiguration {

	@Bean
	public CustomerExceptionHandler customerExceptionHandler() {
		return new CustomerExceptionHandler();
	}

	@Bean
	public RestClientUtil getRestClientUtil() {
		return new RestClientUtil();
	}

}
