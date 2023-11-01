package com.sunbeam;

public class DoublyLinearList {
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

	public DoublyLinearList() {
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

	public void addPosition(int value, int pos) {
		if (isEmpty())
			addFirst(value);
		else if (pos <= 1)
			addFirst(value);
		else {
			Node trav = head;
			for (int i = 1; i < pos; i++) {
				trav = trav.next;
				if (trav == head)
					break;
			}
			if (trav == head)
				addLast(value);
			else {
				Node node = new Node(value);
				node.next = trav;
				node.prev = trav.prev;
				trav.prev.next = node;
				trav.prev = node;
			}

		}
	}

	public void deletePosition(int pos) {
		if (isEmpty())
			System.out.println("List is empty.");
		else if(pos<1)
			System.out.println("Invalid position.");
		else if (head == tail || pos==1)
			delFirst();
		else {
			Node trav = head;
			for (int i = 1; i < pos; i++) {
				trav = trav.next;
				if (trav == head)
					break;
			}
			if(trav==head || trav==tail)
				delLast();
			else
			{
				trav.prev.next = trav.next;
				trav.next.prev = trav.prev;
			}
		}
	}
}
