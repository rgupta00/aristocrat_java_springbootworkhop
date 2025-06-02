package com.productapp.service;

import com.productapp.dao.Product;
import com.productapp.dao.ProductDao;
import com.productapp.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	private ValidationService validationService;

	public ProductServiceImpl() {
		productDao = new ProductDaoImpl();
		validationService = new ValidationServiceImpl();
	}

	@Override
	public void addProduct(Product product) {
		if (validationService.isValid(product))
			productDao.addProduct(product);
		else
			System.out.println("data validation failed");
	}

}
