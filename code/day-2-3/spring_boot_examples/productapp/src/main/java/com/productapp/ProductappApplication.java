package com.productapp;

import com.productapp.dao.Product;
import com.productapp.dao.ProductRepo;
import jakarta.persistence.EntityManager;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.sql.DataSource;
import java.math.BigDecimal;
//@EnableScheduling
@SpringBootApplication
@Log4j2
public class ProductappApplication implements CommandLineRunner {

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(ProductappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		productRepo.save(new Product("Laptop", BigDecimal.valueOf(90000.00)));
//		productRepo.save(new Product("Mobile", BigDecimal.valueOf(5000.00)));
//		productRepo.save(new Product("Tablet", BigDecimal.valueOf(300.00)));
//		log.info("--------------------------------------------");
	}
}

//
//@SpringBootApplication
//public class ProductappApplication implements CommandLineRunner {
//
//	@Autowired
//	private DataSource dataSource;
//
//	@Autowired
//	private EntityManager entityManager;
//
//	//if u want quick and dirty way to run some code just after spring boot have been
//	//started
//	public static void main(String[] args) {
//		ApplicationContext ctx= SpringApplication.run(ProductappApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("---------------------------------------");
//		if(dataSource!=null){
//			System.out.println("data source is "+dataSource);
//		}
//		if(entityManager!=null){
//			System.out.println("entity manager is "+entityManager);
//		}
//	}
//}
