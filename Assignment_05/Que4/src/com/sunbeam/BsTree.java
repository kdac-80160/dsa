package com.sunbeam;

public class BsTree {
	class Node {
		private Node left;
		private int data;
		private Node right;

		public Node(int value) {
			this.left = null;
			this.right = null;
			this.data = value;
		}
	}

	private Node root;

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		Node node = new Node(value);
		if (isEmpty())
			root = node;
		else {
			Node trav = root;
			while (true) {
				if (node.data < trav.data) {
					if (trav.left == null) {
						trav.left = node;
						break;
					}
					trav = trav.left;
				}

				else {
					if (trav.right == null) {
						trav.right = node;
						break;
					}
					trav = trav.right;
				}
			}
		}
	}

	private void addUsingRecursion(Node trav, int value) {
		if (value < trav.data) {
			if (trav.left == null) {
				trav.left = new Node(value);
				return;
			} else
				addUsingRecursion(trav.left, value);
		} else {
			if (trav.right == null) {
				trav.right = new Node(value);
				return;
			}
			addUsingRecursion(trav.right, value);
		}
	}

	public void addUsingRecursion(int value) {
		if (isEmpty())
			root = new Node(value);
		else
			addUsingRecursion(root, value);
	}

	private void preOrderTrav(Node trav) {
		if (trav == null)
			return;
		System.out.print(trav.data + " ");
		preOrderTrav(trav.left);
		preOrderTrav(trav.right);
	}

	public void preOrderTrav() {
		if (isEmpty()) {
			System.out.println("Tree is empty.");
			return;
		}
		preOrderTrav(root);
		System.out.println();
	}

	public void inOrderTrav() {
		if (isEmpty()) {
			System.out.println("Tree is empty.");
			return;
		}
		inOrderTrav(root);
		System.out.println();
	}

	private void inOrderTrav(Node trav) {
		if (trav == null)
			return;
		inOrderTrav(trav.left);
		System.out.print(trav.data + " ");
		inOrderTrav(trav.right);
	}

	public void postOrderTrav() {
		if (isEmpty()) {
			System.out.println("Tree is empty.");
			return;
		}
		postOrderTrav(root);
		System.out.println();
	}

	private void postOrderTrav(Node trav) {
		if (trav == null)
			return;
		postOrderTrav(trav.left);
		postOrderTrav(trav.right);
		System.out.print(trav.data + " ");
	}
}
