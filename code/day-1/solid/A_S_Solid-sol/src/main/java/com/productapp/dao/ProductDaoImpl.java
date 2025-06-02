package com.productapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDaoImpl implements ProductDao {

	private Connection connection;
	
	public ProductDaoImpl() {
		connection=ConnectionFactory.getConnection();
	}
	@Override
	public void addProduct(Product product) {
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into product(name,price) values(?,?)");
			pstmt.setString(1, product.getName());
			pstmt.setDouble(2, product.getPrice());

			pstmt.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
