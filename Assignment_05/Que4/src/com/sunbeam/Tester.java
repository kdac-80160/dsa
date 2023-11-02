package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		BsTree tree = new BsTree();
		tree.addUsingRecursion(9);
		tree.addUsingRecursion(5);
		tree.addUsingRecursion(15);
		tree.addUsingRecursion(6);
		tree.addUsingRecursion(3);
		tree.addUsingRecursion(7);
		tree.addUsingRecursion(1);
		tree.addUsingRecursion(4);
		tree.addUsingRecursion(2);
		tree.addUsingRecursion(8);
		tree.preOrderTrav();
		tree.inOrderTrav();
		tree.postOrderTrav();
	}

}
