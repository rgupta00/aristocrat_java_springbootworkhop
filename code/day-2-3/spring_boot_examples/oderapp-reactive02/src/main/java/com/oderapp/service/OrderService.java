package com.oderapp.service;

import com.oderapp.dto.Order;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface OrderService {
    //declare crud methods
    public Mono<Order> save(Order order);
    public Mono<Order> get(Long id);
    public Mono<Void> delete(Long id);
    public Flux<Order> getAll();
}
