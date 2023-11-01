package stack;

public class StackUsingList {
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

	public StackUsingList() {
		this.head = null;
		this.tail = null;
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	public void push(int value) {
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

	public void pop() {
		if (isEmpty())
			System.out.println("Stack is empty.");
		else if (head == tail) {
			head = null;
			tail = null;
		} else {
			tail.next = head.next;
			head.next.prev = tail;
			head = head.next;
		}
	}
	
	public void peek()
	{
		if (isEmpty())
			System.out.println("Stack is empty.");
		else
			System.out.println(head.data);
	}
}
