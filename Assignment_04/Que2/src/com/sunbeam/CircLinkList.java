package com.sunbeam;

public class CircLinkList {
	class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
			this.next = null;
		}
	}

	private Node tail;

	public CircLinkList() {
		this.tail = null;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(int value) {
		if (this.isEmpty()) {
			this.tail = new Node(value);
			this.tail.next = tail;
		}

		else {
			Node node = new Node(value);
			node.next = tail.next;
			this.tail.next = node;
		}
	}

	public void addLast(int value) {
		if (this.isEmpty()) {
			this.tail = new Node(value);
			this.tail.next = tail;
		}

		else {
			Node node = new Node(value);
			node.next = this.tail.next;
			this.tail.next = node;
			this.tail = node;
		}
	}

	public void delFirst() {
		if (this.isEmpty())
			System.out.println("List is empty.");
		else if (this.tail == this.tail.next)
			this.tail = null;
		else {
			this.tail.next = this.tail.next.next;
		}
	}

	public void delLast() {
		if (this.isEmpty())
			System.out.println("List is empty.");
		else if (this.tail == this.tail.next)
			this.tail = null;
		else {
			Node trav = tail.next;
			while (trav.next != this.tail) {
				trav = trav.next;
			}
			trav.next = this.tail.next;
			this.tail = trav;
		}
	}

	public void display() {
		if (this.isEmpty())
			System.out.println("List is empty.");
		else {
			Node trav = this.tail.next;
			do {
				if(trav==this.tail)
					System.out.println(trav.data);
				else
				System.out.print(trav.data+"->");
				trav = trav.next;
			} while (trav!= this.tail.next);

		}
	}
}
