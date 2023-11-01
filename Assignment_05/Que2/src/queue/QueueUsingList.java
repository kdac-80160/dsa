package queue;

public class QueueUsingList {
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

	public QueueUsingList() {
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

	public void pop() {
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
	
	public void peek()
	{
		if (isEmpty())
			System.out.println("List is empty.");
		else
			System.out.println(head.data);
	}
}
