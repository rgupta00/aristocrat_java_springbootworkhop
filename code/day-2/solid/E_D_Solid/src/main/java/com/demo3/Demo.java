package com.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		//testable, flexible
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		Car car=(Car) ctx.getBean("car");
		car.drive();
		
	}
}
