package com.productapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductappApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(ProductappApplication.class, args);
//		String []beansNames=ctx.getBeanDefinitionNames();
//		for(String name:beansNames) {
//			System.out.println(name);
//		}
	}

}
