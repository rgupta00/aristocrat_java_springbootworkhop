package com.oderapp.service;

import com.oderapp.dto.Order;
import com.oderapp.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Mono<Order> save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Mono<Order> get(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public Mono<Void> delete(Long id) {
       return orderRepository.deleteById(id);
    }

    @Override
    public Flux<Order> getAll() {
        return orderRepository.findAll();
    }
}
