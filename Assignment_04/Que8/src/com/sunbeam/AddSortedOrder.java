package com.sunbeam;

public class AddSortedOrder {

	public static void main(String[] args) {
		SinglyLinearLinkedList list = new SinglyLinearLinkedList();
		list.addSorted(10);
		list.addSorted(5);
		list.addSorted(14);
		list.addSorted(12);
		list.addSorted(20);
		list.addSorted(16);
		
		list.display();
	}

}
