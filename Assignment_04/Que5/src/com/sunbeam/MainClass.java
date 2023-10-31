package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		SinglyLinearLinkedList list =  new SinglyLinearLinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addAfter(10,90);
		list.display();
		list.addBefore(90, 80);
		list.display();
	}

}
