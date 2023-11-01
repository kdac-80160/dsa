package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		DequeUsingList deque = new DequeUsingList();
		
		deque.addFirst(2);
		deque.addLast(3);
		deque.addLast(4);
		deque.addFirst(1);
		deque.display();
	}

}
