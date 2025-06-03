package com.productapp.dao;

import com.productapp.dao.connectionfactory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProductDaoJdbcImpl implements ProductDao{
    private ConnectionFactory connectionFactory;
    public ProductDaoJdbcImpl(){
        connectionFactory = new ConnectionFactory();
    }

    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public void addProduct(Product product) {
        try {
            Connection connection = connectionFactory.getConnection();
            PreparedStatement pstmt = connection.prepareStatement
                    ("insert into product(name,price) values(?,?)");
            pstmt.setString(1, product.getName());
            pstmt.setDouble(2, product.getPrice());

            pstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
