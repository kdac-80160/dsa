package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		SinglyLinearLinkedList list =  new SinglyLinearLinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.delLast();
		list.delFirst();
		list.addFirst(90);
		list.display();
	}

}
