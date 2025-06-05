package com.productapp.service;

import com.productapp.dao.Product;
import com.productapp.dao.ProductRepo;
import com.productapp.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Cacheable(value = "products")
    @Override
    public List<Product> getAll() {
        System.out.println("-----------------get all is called------------");
        //delayMethod();
        return productRepo.findAll();
    }

    private static void delayMethod() {
        try{
            Thread.sleep(500);
        }catch (Exception e){

        }
    }

    @Override
    public Product getProductById(int productId) {
        return productRepo.findById(productId)
                .orElseThrow(()-> new ProductNotFoundException("product with id "+ productId +" is not found"));
    }

    @Override
    public Product addProduct(Product product) {
        productRepo.save(product);
        return product;
    }

    @Override
    public Product updateProduct(int productId, Product product) {
       Product updatedProduct = getProductById(productId);
       updatedProduct.setPrice(product.getPrice());
       productRepo.save(updatedProduct);
       return updatedProduct;
    }

    @Override
    public Product deleteProduct(int productId) {
        Product productToDelete = getProductById(productId);
        productRepo.delete(productToDelete);
        return productToDelete;
    }

    @Override
    public List<Product> getByName(String name) {
        return productRepo.findByNameIgnoreCase(name);
    }
    @CacheEvict(value="products", allEntries=true)
    @Override
    public void evictCache() {}
}
