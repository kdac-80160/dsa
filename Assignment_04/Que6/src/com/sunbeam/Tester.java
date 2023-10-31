package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		SortList list = new SortList();
		
		list.addLast(5);
		list.addLast(3);
		list.addLast(1);
		list.addLast(6);
		list.addLast(2);
		list.addLast(4);
		list.display();
		
		list.sortList();
		
		list.display();
	}

}
