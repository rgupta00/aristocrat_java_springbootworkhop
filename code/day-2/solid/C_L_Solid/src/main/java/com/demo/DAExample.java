package com.demo;
class Ak47{	
}
class SuperGun extends Ak47{	
}
class Don{
	public void shootAnyBody(Ak47 ak47) {
		System.out.println("shootAnyBody ");
	}
	public void enjoy() {
		System.out.println("enjoy");
	}
}
class DonNextGen{
	private Don don=new Don();
	
	public void enjoy() {
		System.out.println("super ");
		don.enjoy();
	}
}

//class DonNextGen extends Don{
//
//	public void enjoy() {
//		System.out.println("enjoy enjoy super");
//	}
//}

public class DAExample {
	
	public static void main(String[] args) {
		DonNextGen donNextGen=new DonNextGen();
		donNextGen.enjoy();
	}

}
