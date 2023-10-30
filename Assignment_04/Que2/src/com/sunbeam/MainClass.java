package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		CircLinkList list = new CircLinkList();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		list.addFirst(5);
		list.delFirst();
		list.delLast();
		list.display();
	}

}
