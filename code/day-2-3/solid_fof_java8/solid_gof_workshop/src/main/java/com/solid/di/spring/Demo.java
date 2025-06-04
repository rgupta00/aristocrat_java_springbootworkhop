package com.solid.di.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
//		Tyre tyre=new MrfTyre();
//		Engine engine=new V8Engine();
//		Car car =new Car(engine, tyre);
//		car.drive();

//		ApplicationContext applicationContext=
//				new ClassPathXmlApplicationContext("demo.xml");

		ApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(AppConfig.class);

		Car car=(Car) applicationContext.getBean("car");
		car.drive();
	}
}
