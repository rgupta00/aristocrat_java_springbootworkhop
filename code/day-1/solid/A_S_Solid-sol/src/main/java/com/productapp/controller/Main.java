package com.productapp.controller;

import java.sql.SQLException;

import com.productapp.dao.Product;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

public class Main {

	public static void main(String[] args) {
//		Product product=new Product("laptop coolpad",1800.00);
//		product.addProduct();
		ProductService productService=new ProductServiceImpl();
		productService.addProduct(new Product("ink pot", 120));
	}
}
