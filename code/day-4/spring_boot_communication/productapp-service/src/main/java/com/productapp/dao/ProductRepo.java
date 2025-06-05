package com.productapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    //to provide u additional methods
    public List<Product> findByNameIgnoreCase(String name);

}
