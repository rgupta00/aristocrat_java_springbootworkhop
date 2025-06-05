package com.oderapp.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Order {
    private Long id;
    private Double price;
}
