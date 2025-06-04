package com.productapp.dao;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "products")
public class Product  {

	@Id
	private String id;
	@NotNull(message = "{product.name.absent}")
	@Pattern(regexp = "[A-Za-z]+( [A-Za-z]+)*", message = "{product.name.invalid}")

	private String name;

	@NotNull(message = "{product.price.absent}")
	@Range(min = 100, max = 100000, message = "{product.price.invalid}")


	private BigDecimal price;


	public Product(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
}
