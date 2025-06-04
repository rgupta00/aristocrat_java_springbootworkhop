package com.solid.di.spring;

import org.springframework.stereotype.Component;

// <bean id="tyre" class="com.solid.di.spring.CeatTyre"/>
@Component("tyre")
public class CeatTyre implements Tyre {
	public void rotate() {
		System.out.println("ceat tyre is rotating");
	}
}
