package com.sunbeam;

import java.util.Scanner;

public class StackUsingQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, size;
		System.out.print("Enter size : ");
		size = sc.nextInt();
		Queue queue1 = new Queue(size);
		Queue queue2 = new Queue(size);

		do {
			System.out.println("0 : Exit\n1 : Push\n2 : Pop\n3 : Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				break;
			case 1:
				if (queue1.isFull())
					System.out.println("Stack is full.");
				else {
					int element;
					System.out.print("Enter element to push : ");
					element = sc.nextInt();
					queue2.push(element);
					while (!queue1.isEmpty())
						queue2.push(queue1.pop());
					while (!queue2.isEmpty())
						queue1.push(queue2.pop());
				}
				break;

			case 2:
				if (queue1.isEmpty())
					System.out.println("Stack is empty.");
				else
					queue1.pop();
				break;

			case 3:
				if (queue1.isEmpty())
					System.out.println("Stack is empty.");
				else
					System.out.println("Peek : " + queue1.peek());
				break;
			default:
				System.out.println("Enter a valid choice.");
			}
		} while (choice != 0);
	}

}
