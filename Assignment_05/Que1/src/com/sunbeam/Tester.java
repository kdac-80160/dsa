package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		DoublyLinearList list = new DoublyLinearList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.display();
		
		list.addPosition(9, 6);
		list.display();
		list.deletePosition(2);
		list.display();
	}

}
