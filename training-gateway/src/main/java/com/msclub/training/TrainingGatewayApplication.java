package com.msclub.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class TrainingGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingGatewayApplication.class, args);
	}
}
