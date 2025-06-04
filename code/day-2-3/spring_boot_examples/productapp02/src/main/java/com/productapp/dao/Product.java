package com.productapp.dao;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product  {

	private Integer id;
	@NotNull(message = "{product.name.absent}")
	@Pattern(regexp = "[A-Za-z]+( [A-Za-z]+)*", message = "{product.name.invalid}")
	private String name;

	@NotNull(message = "{product.price.absent}")
	@Range(min = 100, max = 100000, message = "{product.price.invalid}")
	private BigDecimal price;
}
