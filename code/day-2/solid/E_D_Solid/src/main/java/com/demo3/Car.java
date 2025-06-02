package com.demo3;
//Car compose of Tyre and engine
public class Car {
	
	private Engine engine;
	private Tyre tyre;
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() {
		engine.move();
		tyre.rotate();
	}
}
