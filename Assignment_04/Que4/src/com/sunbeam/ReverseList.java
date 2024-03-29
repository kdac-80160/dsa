package com.sunbeam;

public class ReverseList {
	class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
			this.next = null;
		}
	}

	private Node head;
	private Node tail;

	public ReverseList() {
		this.head = null;
		this.tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		if (this.isEmpty()) {
			Node node = new Node(value);
			this.head = node;
			this.tail = node;

		} else if (this.head == this.tail) {
			Node node = new Node(value);
			node.next = head;
			this.head = node;
		}

		else {
			Node node = new Node(value);
			node.next = this.head;
			head = node;
		}
	}

	public void addLast(int value) {
		if (this.isEmpty()) {
			Node node = new Node(value);
			this.head = node;
			this.tail = node;
		}

		else if (this.head == this.tail) {
			Node node = new Node(value);
			this.tail = node;
			this.head.next = node;
		}

		else {
			Node node = new Node(value);
			tail.next = node;
			this.tail = node;
		}
	}

	public void delFirst() {
		if (this.isEmpty())
			System.out.println("List is empty.");
		else if (this.head == this.tail) {
			this.head = null;
			this.tail = null;
		} else
			this.head = this.head.next;
	}

	public void delLast() {
		if (this.isEmpty())
			System.out.println("List is empty.");

		else if (this.head == this.tail) {
			this.head = null;
			this.tail = null;
		}

		else {
			Node trav = head;
			while (trav.next.next != null) {
				trav = trav.next;
			}
			trav.next = null;
			this.tail = trav;
		}

	}

	public void display() {
		Node trav = head;
		while (trav != null) {
			if (trav.next != null)
				System.out.print(trav.data + "->");
			else
				System.out.println(trav.data);
			trav = trav.next;
		}
	}

	public void reverseList() {
		this.tail = head;
		Node rear, front;
		rear = head;
		head = head.next;
		front = head.next;
		this.tail.next = null;
		while(true) {
		head.next = rear;
		rear = head;
		if(front==null)
			break;
		head = front;
		front = front.next;
		}
	}
}
