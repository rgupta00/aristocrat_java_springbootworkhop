package com.demo;
//assume we have a good class, min the misuse

interface AppInterface{
	public void f2();
	public void f3();
}

class GodClass implements AppInterface{
	public void f1() {
		System.out.println("i am funcation f1");
	}

	public void f2() {
		System.out.println("i am funcation f2");
	}

	public void f3() {
		System.out.println("i am funcation f3");
	}

	public void f4() {
		System.out.println("i am funcation f4");
	}
}




class App{
	private AppInterface class1=new GodClass();
	
	//i want that only f2 and f3 should only be used
	public void foo() {
		class1.f2();
		class1.f3();
		//class1.f1();
	}
}

public class B_DemoGodClass {

	public static void main(String[] args) {

	}

}
