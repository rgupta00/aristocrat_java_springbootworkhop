package com.demo;

import java.util.ArrayList;
import java.util.LinkedList;
//FIFO
//Create queue using LL

public class Queue  {
	private LinkedList<String> linkedList;
	public Queue() {
		linkedList=new LinkedList<>();
	}

	public void addData(String data) {
		linkedList.addLast(data);
	}
	
	public void removeData() {
		linkedList.removeFirst();
	}
}





//hell code

//public class Queue extends LinkedList<String> {
//	
//	public void addData(String data) {
//		super.addLast(data);
//	}
//	
//	public void removeData() {
//		super.removeFirst();
//	}
//}
