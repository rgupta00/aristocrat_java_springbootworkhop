package com.oderapp.controller;

import com.oderapp.dto.Order;
import com.oderapp.service.OrderService;
import com.oderapp.util.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.lang.management.MonitorInfo;
import java.time.Duration;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

import static org.springframework.web.reactive.function.BodyExtractors.toMono;
import static org.springframework.web.reactive.function.server.ServerResponse.*;

@Component
public class OrderHandler {

    private final OrderService orderService;

    @Autowired
    public OrderHandler(OrderService orderService) {
        this.orderService = orderService;
    }

    public Mono<ServerResponse> save(ServerRequest request) {
        Mono<Order> order = request.body(toMono(Order.class));
        return ServerResponse.ok().contentType(MediaType.TEXT_EVENT_STREAM)
                .body(order.flatMap(orderService::save), Order.class);
    }

    public Mono<ServerResponse> get(ServerRequest request) {
        Long id = Long.valueOf(request.pathVariable("id"));
        return orderService.get(id)
                .flatMap(order -> ok().bodyValue(order))
                .switchIfEmpty(notFound().build());
    }

    public Mono<ServerResponse> delete(ServerRequest request) {
        Long id = Long.valueOf(request.pathVariable("id"));
        return orderService.delete(id)
                .then(noContent().build());
    }

    public Mono<ServerResponse> getAll(ServerRequest request) {
        Flux<Order> orders = orderService.getAll();
        return ok().body(orders, Order.class);
    }
}
//Handler function
//@Component
//public class OrderHandler {
//
//    @Autowired
//    private OrderService orderService;
//
//    //get all orders logic
//    public Mono<ServerResponse> getAll(ServerRequest serverRequest){
//        return  ServerResponse.ok()
//                .contentType(MediaType.TEXT_EVENT_STREAM)
//                .body(orderService.getAll().delayElements(Duration.ofSeconds(1)).log(),
//                        Order.class);
//    }
//    //save order logic
//    public Mono<ServerResponse> save(ServerRequest serverRequest){
//        Mono<Order> orderMono = serverRequest.bodyToMono(Order.class);
//        return ServerResponse.ok()
//                .contentType(MediaType.TEXT_EVENT_STREAM)
//                .body(orderMono.flatMap(orderService->orderService.save(orderService)).log(),Order.class);
//    }
//
//}
