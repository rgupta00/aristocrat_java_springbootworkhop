package com.productapp.controller;

import com.productapp.dao.Product;
import com.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    //get all products, how list of products is converted to Jsondata
    //in spring boot app we have a jar file of a Paser "jakson parser", it convert java object to json and vice versa

    //@ResponseBody - convert java object to json
    //@RequestBody - convert json to java object
    @GetMapping("products")
    public List<Product>getAll(){
        return productService.getAll();
    }

    //get by id
    @GetMapping("products/{id}")
    public Product getById(@PathVariable int id){
        return productService.getProductById(id);
    }

    //add product
    @PostMapping("products")
    public Product addProduct( @RequestBody Product product){
        return productService.addProduct(product);
    }

    //delete product
    @DeleteMapping("products/{id}")
    public Product deleteById(@PathVariable int id){
        return productService.deleteProduct(id);
    }

    //update product

    @PutMapping("products/{id}")
    public Product updateById(@PathVariable int id, @RequestBody Product product){
        return productService.updateProduct(id, product);
    }
}
