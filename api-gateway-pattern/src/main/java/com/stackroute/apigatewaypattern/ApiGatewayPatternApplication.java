package com.stackroute.apigatewaypattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableZuulProxy
public class ApiGatewayPatternApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiGatewayPatternApplication.class, args);
	}

}
