package com.sunbeam;

import java.util.Scanner;

public class QueueUsingStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, size;
		System.out.print("Enter size : ");
		size = sc.nextInt();
		Stack stack1 = new Stack(size);
		Stack stack2 = new Stack(size);

		do {
			System.out.println("0 : Exit\n1 : Push\n2 : Pop\n3 : Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				break;
			case 1:
				if (stack1.isFull())
					System.out.println("Queue is full.");
				else {
					int element;
					System.out.print("Enter element to push : ");
					element = sc.nextInt();
					while (!stack1.isEmpty())
						stack2.push(stack1.pop());
					stack2.push(element);
					while (!stack2.isEmpty())
						stack1.push(stack2.pop());
				}
				break;

			case 2:
				if (stack1.isEmpty())
					System.out.println("Queue is empty.");
				else
					stack1.pop();
				break;

			case 3:
				if (stack1.isEmpty())
					System.out.println("Queue is empty.");
				else
					System.out.println("Peek : " + stack1.peek());
				break;
			default:
				System.out.println("Enter a valid choice.");
			}
		} while (choice != 0);

	}

}
