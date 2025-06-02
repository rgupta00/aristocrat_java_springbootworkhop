package com.demo;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		Product product=new Product("laptop coolpad",1800.00);
		product.addProduct();
	}
}
