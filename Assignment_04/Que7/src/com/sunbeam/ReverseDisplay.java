package com.sunbeam;

public class ReverseDisplay {

	public static void main(String[] args) {
		SinglyLinearLinkedList list = new SinglyLinearLinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.display();
		list.revDisplay();
	}

}
