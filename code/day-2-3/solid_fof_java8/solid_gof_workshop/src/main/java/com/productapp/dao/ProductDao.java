package com.productapp.dao;

import java.util.List;

public interface ProductDao {
    public List<Product> getAll();
    public void addProduct(Product product);
    //CRUD methods
}
