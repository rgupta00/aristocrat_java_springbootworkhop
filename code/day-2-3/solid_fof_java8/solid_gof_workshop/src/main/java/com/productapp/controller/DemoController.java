package com.productapp.controller;

import com.productapp.dao.Product;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

public class DemoController {
    public static void main(String[] args) {
        ProductService productService= new ProductServiceImpl();
        productService.addProduct(new Product("laptop cover white",1800.00));
    }
}
