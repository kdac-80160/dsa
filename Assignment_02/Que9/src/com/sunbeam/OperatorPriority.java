package com.sunbeam;

import java.util.Scanner;

public class OperatorPriority {

	public static int operatorPriority(char operator) {
		switch (operator) {
		case '+':
			return 1;
		case '-':
			return 1;
		case '*':
			return 2;
		case '%':
			return 2;
		case '/':
			return 2;
		case '$':
			return 3;
		}
		return 0;
	}

	public static void main(String[] args) {
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an operator : ");
		try {
			operator = sc.next().charAt(0);
			int priority = operatorPriority(operator);
			System.out.println("Priority of " + operator + " is : " + priority);
		} catch (Exception e) {
			System.out.println("Wrong input.");
		} finally {
			sc.close();
		}
	}

}
