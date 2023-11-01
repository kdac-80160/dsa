package com.sunbeam;

public class DequeUsingList {
	class Node {
		private Node prev;
		private int data;
		private Node next;

		public Node(int value) {
			this.prev = null;
			this.next = null;
			this.data = value;
		}
	}

	private Node head;
	private Node tail;

	public DequeUsingList() {
		this.head = null;
		this.tail = null;
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	public void addFirst(int value) {
		Node node = new Node(value);
		if (isEmpty()) {
			head = tail = node;
			node.next = node.prev = node;
		} else if (head == tail) {
			node.next = head;
			node.prev = tail;
			head.prev = node;
			head.next = node;
			head = node;
		} else {
			node.next = head;
			node.prev = tail;
			head.prev = node;
			tail.next = node;
			head = node;
		}
	}

	public void addLast(int value) {
		Node node = new Node(value);
		if (isEmpty()) {
			head = tail = node;
			node.next = node.prev = node;
		} else if (head == tail) {
			node.prev = tail;
			node.next = head;
			head.next = node;
			head.prev = node;
			tail = node;
		} else {
			node.next = head;
			node.prev = tail;
			tail.next = node;
			head.prev = node;
			tail = node;
		}
	}

	public void delFirst() {
		if (isEmpty())
			System.out.println("List is empty.");
		else if (head == tail) {
			head = null;
			tail = null;
		} else {
			tail.next = head.next;
			head.next.prev = tail;
			head = head.next;
		}
	}

	public void delLast() {
		if (isEmpty())
			System.out.println("List is empty.");
		else if (head == tail) {
			head = null;
			tail = null;
		} else {
			tail.prev.next = head;
			head.prev = tail.prev;
			tail = tail.prev;
		}
	}
	
	public void display() {
		Node trav = head;
		while (trav.next != head) {
			System.out.print(trav.data + "->");
			trav = trav.next;
		}
		System.out.println(trav.data);
	}
}
