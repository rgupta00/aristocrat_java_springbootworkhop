package com.productapp.service;

import com.productapp.dao.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAll();
    public Product getProductById(String productId);
    public Product addProduct(Product book);
    public Product updateProduct(String productId, Product product);
    public Product deleteProduct(String productId);

    public List<Product> getByName(String name);
    public void evictCache();
}
