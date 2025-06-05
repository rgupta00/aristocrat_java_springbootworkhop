package com.productapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableFeignClients("com.productapp.serviceproxy")
@SpringBootApplication
public class ProductappClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductappClientApplication.class, args);
	}
	//RestTemplate aka template dp gof
	@Bean
	public RestTemplate restTemplate(){
		return  new RestTemplate();
	}

}
