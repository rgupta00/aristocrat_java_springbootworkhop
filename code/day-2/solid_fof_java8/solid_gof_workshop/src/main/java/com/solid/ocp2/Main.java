package com.solid.ocp2;

import com.solid.dip.demo.Car;

public class Main {

	public static void main(String[] args) {
//	Vehical v=new Car();
//	Car car=new Car();

		//CircleShape circleShape=new CircleShape();
		Shape rectangleShape=new RectangleShape();
		ProcessShape.process(rectangleShape);
	}
}
