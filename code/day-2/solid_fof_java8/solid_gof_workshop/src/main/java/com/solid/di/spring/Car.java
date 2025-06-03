package com.solid.di.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Car compose of Tyre and engine
//DIP
//DI = Dependency Injection
/*
 */
@Component("car") //<bean id="car" class="com.solid.di.spring.Car">
public class Car {

	private Engine engine;

	private Tyre tyre;

	public Car() {
	}
	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Autowired
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public Car(Engine engine, Tyre tyre) {
		this.engine = engine;
		this.tyre = tyre;
	}

	public void drive() {
		engine.move();
		tyre.rotate();
	}
	
}
