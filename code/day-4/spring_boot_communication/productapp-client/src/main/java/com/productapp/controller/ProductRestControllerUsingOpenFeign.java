package com.productapp.controller;

import com.productapp.dto.Product;
import com.productapp.serviceproxy.ProductServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestControllerUsingOpenFeign {

    private ProductServiceProxy productServiceProxy;

    @Autowired
    public ProductRestControllerUsingOpenFeign(ProductServiceProxy productServiceProxy) {
        this.productServiceProxy = productServiceProxy;
    }
    //crud application client
    @GetMapping("/productclient")
    public List<Product> getAll(){
        return productServiceProxy.getAll().getBody();
    }

}
