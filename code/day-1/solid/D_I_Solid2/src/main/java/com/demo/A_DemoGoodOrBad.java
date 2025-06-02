package com.demo;
//"seprate what varies"

interface Swimmable{
	void swim() ;
}

interface Flyable{
	void fly() ;
}

class Bird {
	void sound() {
		System.out.println("bird sound");
	}
}

class Eagle extends Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("flying high...");
	}
	
}

class Emu extends Bird {
}

class Duck extends Bird implements Swimmable{

	@Override
	public void swim() {
		System.out.println("swimming :)");
	}

}

public class A_DemoGoodOrBad {

	public static void main(String[] args) {
		Eagle eagle=new Eagle();
		//eagle.swim();
	}
}
