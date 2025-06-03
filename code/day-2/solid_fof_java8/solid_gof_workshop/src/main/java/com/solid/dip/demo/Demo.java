package com.solid.dip.demo;

public class Demo {

	public static void main(String[] args) {
		Tyre tyre=new MrfTyre();
		Engine engine=new V8Engine();
		Car car =new Car(engine, tyre);
		car.drive();
	}
}
