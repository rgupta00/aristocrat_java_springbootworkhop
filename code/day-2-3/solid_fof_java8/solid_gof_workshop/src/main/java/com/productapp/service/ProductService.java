package com.productapp.service;

import com.productapp.dao.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAll();
    public void addProduct(Product product);
}
