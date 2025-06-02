package com.demo2;

public class Demo {

	public static void main(String[] args) {
		
		//testable, flexible
		
		Tyre tyre=new MrfTyre();
		Engine engine=new V8Engine();
		
		//Manual DI: i am doing myself
		Car car =new Car(engine, tyre);
		//Spring framework: IOC container. that automized job of assigning the object
	
		car.drive();
	}
}
