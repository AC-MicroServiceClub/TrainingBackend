package com.msclub.gateway;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.msclub.gateway.filter.BusinessFilter;

@SpringBootApplication
@EnableZuulProxy
public class TrainingGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingGatewayApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean(BusinessFilter businessFilter) {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(businessFilter);

		List<String> urlPatterns = new ArrayList<>();
		urlPatterns.add("/training/*");
		urlPatterns.add("/common/*");
		filterRegistrationBean.setUrlPatterns(urlPatterns);
		return filterRegistrationBean;
	}
}
