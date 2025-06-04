package com.productapp.service;

import com.productapp.dao.Product;
import com.productapp.dao.ProductDao;
import com.productapp.dao.ProductDaoJdbcImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    private ProductDao productDao;
    private ValidationService validationService;

    public ProductServiceImpl(){
        productDao = new ProductDaoJdbcImpl();
        validationService = new ValidationServiceImpl();
    }
    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public void addProduct(Product product) {
        if(validationService.valiation(product)){
            productDao.addProduct(product);
        }
    }
}
