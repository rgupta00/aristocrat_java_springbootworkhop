package com.oderapp.controller;

import com.oderapp.dto.Order;
import com.oderapp.util.DataUtil;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.lang.management.MonitorInfo;
import java.time.Duration;

//Handler function
@Component
public class OrderHandler {

    public Mono<ServerResponse> getAll(ServerRequest serverRequest){
        return  ServerResponse.ok()
                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(DataUtil.generateRandomOrders().delayElements(Duration.ofSeconds(1)).log(),
                        Order.class);
    }
}
