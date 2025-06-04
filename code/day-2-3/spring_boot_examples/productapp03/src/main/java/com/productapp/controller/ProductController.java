package com.productapp.controller;

import com.productapp.dao.Product;
import com.productapp.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

    //ResponseEntity : bag = data + status code

    @GetMapping(path = "products", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<List<Product>>  getAll(){
        return ResponseEntity.ok(productService.getAll());
    }

    //get by id
    @GetMapping("products/{id}")
    public ResponseEntity<Product> getById(@PathVariable int id){
        return ResponseEntity.ok(productService.getProductById(id));
    }
    @GetMapping("productsbyname/{name}")
    public ResponseEntity<List<Product>> getByName(@PathVariable String name){
        return ResponseEntity.ok(productService.getByName(name));
    }

    //add product
    @PostMapping("products")
    public ResponseEntity<Product> addProduct( @RequestBody @Valid Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.addProduct(product));
    }

    //delete product
    @DeleteMapping("products/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id){
         productService.deleteProduct(id);
         return ResponseEntity.noContent().build();
    }

    //update product

    @PutMapping("products/{id}")
    public ResponseEntity<Product> updateById(@PathVariable int id, @RequestBody @Valid Product product){
        return ResponseEntity.ok(productService.updateProduct(id, product));
    }
}
