package com.sunbeam;

public class SinglyLinearLinkedList {
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

	public SinglyLinearLinkedList() {
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
	
	public void display()
	{
		Node trav = head;
		while(trav!=null)
		{
			if(trav.next!=null)
			System.out.print(trav.data+"->");
			else
				System.out.println(trav.data);
			trav = trav.next;
		}
	}
	
	public void addSorted(int value)
	{
		if(isEmpty())
			addFirst(value);
		else if(head.next==null)
		{
			if(head.data>value)
				addFirst(value);
			else
				addLast(value);
		}
		else if(head.data>value)
			addFirst(value);
		else
		{
			Node trav = head;
			while(trav.next!=null && trav.next.data<value)
			{
				trav = trav.next;
			}
			if(trav.next==null)
				addLast(value);
			else
			{
				Node node = new Node(value);
				node.next = trav.next;
				trav.next = node;
			}
		}
			
	}
}
