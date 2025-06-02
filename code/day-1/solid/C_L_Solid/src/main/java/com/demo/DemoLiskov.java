package com.demo;

//Rectangle "reuse" Square : Inheritance XXX
class Rectangle {
	private int l, b;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

	public int calculateArea() {
		return l * b;
	}

}
//Why not to inherit rectangle in order to resue the logic

//class Square extends Rectangle {
//
//	public Square(int l) {
//		super(l, l);
//	}
//
//	@Override
//	public int calculateArea() {
//		return super.calculateArea();
//	}
//
//}

class Square {
	private Rectangle rectangle;
	
	
	public Square(int l) {
		rectangle=new Rectangle(l, l);
	}

	public int calculateArea() {
		return rectangle.calculateArea();
	}

	public void changeDimension(int changeLength) {
		rectangle.setB(changeLength);
		rectangle.setL(changeLength);
	}
}

public class DemoLiskov {

	public static void main(String[] args) {
		/*
		 * 
		 * favour composition over inheritance square rectangle liskov java
		 * 
		 */
		Square square = new Square(3);
		int area = square.calculateArea();
		System.out.println(area);
		
		square.changeDimension(10);
		area = square.calculateArea();
		System.out.println(area);
	}
}
