package com.productapp.dao;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "product")
public class Product  {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
//	@NotNull(message = "{product.name.absent}")
//	@Pattern(regexp = "[A-Za-z]+( [A-Za-z]+)*", message = "{product.name.invalid}")

	@Column(name = "product_name")
	private String name;
//
//	@NotNull(message = "{product.price.absent}")
//	@Range(min = 100, max = 100000, message = "{product.price.invalid}")
	@Column(name = "product_price")
	private BigDecimal price;


	public Product(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
}
