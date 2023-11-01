package com.sunbeam;

public class LinkedList {
	class Node {
		private Employee data;
		private Node next;

		public Node(Employee employee) {
			this.data = employee;
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

	public void addFirst(Employee employee) {
		if (this.isEmpty()) {
			Node node = new Node(employee);
			this.head = node;
			this.tail = node;

		} else if (this.head == this.tail) {
			Node node = new Node(employee);
			node.next = head;
			this.head = node;
		}

		else {
			Node node = new Node(employee);
			node.next = this.head;
			head = node;
		}
	}

	public void addLast(Employee employee) {
		if (this.isEmpty()) {
			Node node = new Node(employee);
			this.head = node;
			this.tail = node;
		}

		else if (this.head == this.tail) {
			Node node = new Node(employee);
			this.tail = node;
			this.head.next = node;
		}

		else {
			Node node = new Node(employee);
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
		if (isEmpty()) {
			System.out.println("List is empty.");
			return;
		}
		Node trav = head;
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
	}

	public Employee searchByName(String name) {
		if (isEmpty())
			return null;
		Node trav = head;
		while (trav.next != null) {
			if (trav.data.getName().equals(name))
				return trav.data;
			trav = trav.next;
		}
		if (trav.next == null && trav.data.getName().equals(name))
			return trav.data;
		return null;
	}

	public Node searchById(int id) {
		if (isEmpty())
			return null;
		else if (head.next == null) {
			if (head.data.getEmpid() == id)
				return head;
			else
				return null;
		} else if (head.data.getEmpid() == id) {
			return head;
		} else {
			Node trav = head;
			while (trav.next != null) {
				if (trav.data.getEmpid() == id)
					return trav;

				trav = trav.next;
			}
			if (trav.next == null && trav.data.getEmpid() == id)
				return trav;
			else
				return null;
		}
	}

	public void deleteById(int id) {
		if (isEmpty()) {
			System.out.println("List is empty.");
			return;
		} else if (head.next == null) {
			if (head.data.getEmpid() == id) {
				head = null;
				System.out.println("Employee deleted successfully.");
				return;
			} else
				System.out.println("Id does not exist.");
		} else if (head.data.getEmpid() == id) {
			delFirst();
			System.out.println("Employee deleted successfully.");
			return;
		} else {
			Node trav = head;
			while (trav.next != null) {
				if (trav.next.data.getEmpid() == id) {
					trav.next = trav.next.next;
					System.out.println("Employee deleted successfully.");
					return;
				}
				trav = trav.next;
			}
			if (trav.next == null && trav.data.getEmpid() == id)
				delLast();
			else
				System.out.println("Id does not exist.");
		}
	}

	public boolean updateSalary(int id, double salary) {
		Node node = searchById(id);
		if (node != null) {
			node.data.setSalary(salary);
			return true;
		} else
			return false;
	}
}
