package com.oderapp.util;

import com.oderapp.dto.Order;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class DataUtil {
    public static Flux<Order> generateRandomOrders() {
        return Flux.fromStream(
                IntStream.rangeClosed(1, 50)
                        .mapToObj(i -> new Order(
                                (long) i,
                                ThreadLocalRandom.current().nextDouble(50.0, 500.0)
                        ))
        );

    }
}
