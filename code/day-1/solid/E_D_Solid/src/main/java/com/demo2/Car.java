package com.demo2;
//Car compose of Tyre and engine
public class Car {
	
	private Engine engine;
	private Tyre tyre;
//	
//	//DIP
//	public Car() {
//		this.engine =new V8Engine();
//		this.tyre=new MrfTyre();
//	}

	//DI
	public Car(Engine engine, Tyre tyre) {
		this.engine =engine;
		this.tyre=tyre;
	}
	
	public void drive() {
		engine.move();
		tyre.rotate();
	}
}
