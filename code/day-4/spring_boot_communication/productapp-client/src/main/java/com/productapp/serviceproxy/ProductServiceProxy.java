package com.productapp.serviceproxy;

import com.productapp.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "product-service", url = "http://localhost:8081/productapp")
public interface ProductServiceProxy {
    @GetMapping(path = "products")
    public ResponseEntity<List<Product>> getAll();

    @GetMapping("products/{id}")
    public ResponseEntity<Product> getById(@PathVariable int id);

    @PostMapping("products")
    public ResponseEntity<Product> addProduct( @RequestBody Product product);

    @DeleteMapping("products/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id);

}
