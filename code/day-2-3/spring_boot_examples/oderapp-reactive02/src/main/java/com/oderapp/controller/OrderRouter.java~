package com.oderapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Mono;

@Controller
public class OrderRouter {


    private OrderHandler orderHandler;

    @Autowired
    public OrderRouter(OrderHandler orderHandler) {
        this.orderHandler = orderHandler;
    }
    //defind a router function for order
    @Bean
   public RouterFunction<ServerResponse> orderRoute() {
       return RouterFunctions.route(RequestPredicates.GET("orders"),orderHandler::getAll);
   }
}
