package com.demo2;

class DA{
	public void shoot() {
		System.out.println("i dont care and think before shooting somebody");
	}
	public void enjoyMoney() {
		System.out.println("enjoyMoney");
	}
	public void holywood() {
		System.out.println("holywood");
	}
}
class SonODA extends DA{
	//he can not shoot anybody
	public void shoot()throws IllegalStateException {
		throw new IllegalStateException();
	}
}
public class DemoLSP {

	public static void main(String[] args) {
		DA da=new SonODA();
		da.shoot();
	}
}
