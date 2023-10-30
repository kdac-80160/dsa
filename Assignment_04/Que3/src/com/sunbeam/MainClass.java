package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
	    list.addLast(4);
		list.addLast(5);
		list.display();
		
		//middle function implemented in LinkedList class
		list.getMiddle();
	}

}
