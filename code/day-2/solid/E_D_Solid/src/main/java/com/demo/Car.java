package com.demo;
//Car compose of Tyre and engine
public class Car {
	
	private V8Engine engine=new V8Engine();
	private CeatTyre ceatTyre=new CeatTyre();
	
	public void drive() {
		engine.move();
		ceatTyre.rotate();
	}
	
}
