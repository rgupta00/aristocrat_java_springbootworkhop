package com.oderapp.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table("orders")
public class Order {
    @Id
    private Long id;
    private Double price;
}
