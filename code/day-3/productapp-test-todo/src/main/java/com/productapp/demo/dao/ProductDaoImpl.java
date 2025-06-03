package com.productapp.demo.dao;

import java.util.List;

public class ProductDaoImpl implements ProductDao{
    @Override
    public List<String> getAll() {
        return List.of("laptop dell","laptop coolpad","rich dad poor dad");
    }
}
