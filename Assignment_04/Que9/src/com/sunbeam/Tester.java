package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(32);
		list.addLast(3);
		list.addLast(16);
		list.addLast(30);
		list.display();
		
		System.out.println("Max : "+list.getMax());
		System.out.println("Min : "+list.getMin());
	}

}
