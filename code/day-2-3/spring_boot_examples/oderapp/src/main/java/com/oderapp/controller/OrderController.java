//package com.oderapp.controller;
//
//import com.oderapp.dto.Order;
//import com.oderapp.util.DataUtil;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Flux;
//
//import java.time.Duration;
//
////Handler
////Router
//@RestController
//public class OrderController {
//    @GetMapping(value = "orders", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public Flux<Order> getAll(){
//        return DataUtil.generateRandomOrders()
//                .delayElements(Duration.ofSeconds(1)).log();
//    }
//}
