package com.solid.di.spring;

import org.springframework.stereotype.Component;

// <bean id="engine" class="com.solid.di.spring.V8Engine"/>
@Component("engine")
public class V8Engine implements Engine {
	public void move() {
		System.out.println("V8 engine is working");
	}
}
