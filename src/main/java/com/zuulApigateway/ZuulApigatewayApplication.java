package com.zuulApigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApigatewayApplication.class, args);
	}

}
