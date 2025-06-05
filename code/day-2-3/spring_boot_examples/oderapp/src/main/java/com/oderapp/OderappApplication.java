package com.oderapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class OderappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OderappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//basics of reactive programming!
		//Mono 0-1
		//Flux 0-n

//		Flux<String> stringFlux=Flux.just("raj","ekta","gunika","chandu","mala")
//				.concatWith(Flux.error(new RuntimeException("error")))
//				.concatWith(Flux.just("abc"))
//				.log();
//
//		stringFlux.subscribe(System.out::println,
//				e-> System.out.println(e.getMessage()),
//				()-> System.out.println("complete"));

		//array to flux
//		String[]arr={"raj","ekta","gunika","chandu","mala"};
//		Flux<String> stringFlux=Flux.fromArray(arr)
//				.concatWith(Flux.error(new RuntimeException("error")))
//				.concatWith(Flux.just("abc"))
//				.log();
//
//		stringFlux.subscribe(System.out::println,
//				e-> System.out.println(e.getMessage()),
//				()-> System.out.println("complete"));

		//mono example
//		Mono<String> stringMono=Mono.just("raj")
//				.log();
//
//		stringMono.subscribe(System.out::println);

	}
}
