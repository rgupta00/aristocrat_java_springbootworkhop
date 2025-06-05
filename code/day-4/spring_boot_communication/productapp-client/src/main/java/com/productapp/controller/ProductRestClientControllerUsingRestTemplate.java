package com.productapp.controller;

import com.productapp.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductRestClientControllerUsingRestTemplate {

    @Autowired
    private RestTemplate restTemplate;

//    @GetMapping("/productclient/{id}")
//     public Product getById(@PathVariable int id){
//         Product product=restTemplate
//                 .getForObject("http://localhost:8081/productapp/products/"+id,Product.class);
//         return product;
//     }
}
