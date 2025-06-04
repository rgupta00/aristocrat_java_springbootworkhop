package com.productapp.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/*
    RDBMS- JpaRepository
        JPA, ORM
    NoSql: mongodb
    MongoRepository


 */
@Repository
public interface ProductRepo extends MongoRepository<Product, String> {
    //to provide u additional methods
    public List<Product> findByNameIgnoreCase(String name);

}
