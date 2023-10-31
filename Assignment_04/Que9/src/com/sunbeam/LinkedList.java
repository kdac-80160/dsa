package com.sunbeam;

public class LinkedList {
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

	public LinkedList() {
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
	
	public int getMax()
	{
		if(isEmpty())
		{
			return 0;
		}
		else if(head.next==null)
			return head.data;
		else
		{
			int max = head.data;
			Node trav = head;
			while(trav.next!=null)
			{
				if(max<trav.next.data)
					max = trav.next.data;
				trav=trav.next;
			}
			return max;
		}
	}
	public int getMin()
	{
		if(isEmpty())
		{
			return 0;
		}
		else if(head.next==null)
			return head.data;
		else
		{
			int min = head.data;
			Node trav = head;
			while(trav.next!=null)
			{
				if(min>trav.next.data)
					min = trav.next.data;
				trav=trav.next;
			}
			return min;
		}
	}
}
