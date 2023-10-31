package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		ReverseList list = new ReverseList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		list.display();
		list.reverseList();
		list.display();
	}

}
