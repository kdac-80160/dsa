package com.sunbeam;

import java.util.Stack;
import java.util.StringTokenizer;

public class AllConversions {

	public static int operatorPriority(String operator) {
		switch (operator) {
		case "+":
			return 1;
		case "-":
			return 1;
		case "*":
			return 2;
		case "%":
			return 2;
		case "/":
			return 2;
		case "$":
			return 3;
		}
		return 0;
	}

	public static int calculate(int a, int b, String c) {
		switch (c) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;
		case "%":
			return a % b;
		}
		return 0;
	}

	public static int postfixEvaluation(String str) {
		Stack<Integer> stack = new Stack<>();
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		String token;
		int res = 0;
		while (tokenizer.hasMoreElements()) {
			token = tokenizer.nextToken();
			if (Character.isDigit(token.charAt(0))) {
				stack.push(Integer.parseInt(token));
			} else {
				int op2 = stack.pop();
				int op1 = stack.pop();
				res = calculate(op1, op2, token);
				stack.push(res);
			}
		}

		return res;
	}

	public static int prefixEvaluation(String str) {
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		str = sb.toString();
		sb.delete(0, sb.length());
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		String token;
		int res = 0;
		while (tokenizer.hasMoreElements()) {
			token = tokenizer.nextToken();
			token = sb.append(token).reverse().toString();
			if (Character.isDigit(token.charAt(0))) {
				stack.push(Integer.parseInt(token));
			} else {
				int op1 = stack.pop();
				int op2 = stack.pop();
				res = calculate(op1, op2, token);
				stack.push(res);
			}
			sb.delete(0, sb.length());
		}

		return res;
	}

	public static String infixToPostfix(String str) {
		String split[] = str.split(" ");
		StringBuilder postfix = new StringBuilder();
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < split.length; i++) {
			if (Character.isDigit(split[i].charAt(0))) {
			postfix.append(split[i]+" ");
			}
			else if (split[i].equals("(")) {				
				stack.push(split[i]);
			} 
			else if (split[i].equals(")")) {
				while (!stack.peek().equals("(")) {
					postfix.append(stack.pop()+" ");
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && operatorPriority(stack.peek()) >= operatorPriority(split[i]))
					postfix.append(stack.pop()+" ");
				stack.push(split[i]);
			}
		}
		while (!stack.isEmpty()) {
			postfix.append(stack.pop()+" ");
		}

		return postfix.toString().trim();
	}
	
	public static String infixToPrefix(String str)
	{
		String split[] = str.split(" ");
		StringBuilder prefix = new StringBuilder();
		StringBuilder split1 = new StringBuilder(); 
		Stack<String> stack = new Stack<>();
		for (int i = split.length-1; i>=0 ; i--) {
			if (Character.isDigit(split[i].charAt(0))) {
				split[i] = split1.append(split[i]).reverse().toString();
			prefix.append(split[i]+" ");
			split1.delete(0, split1.length());
			}
			else if (split[i].equals(")")) {				
				stack.push(split[i]);
			} 
			else if (split[i].equals("(")) {
				while (!stack.peek().equals(")")) {
					prefix.append(stack.pop()+" ");
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && operatorPriority(stack.peek()) > operatorPriority(split[i]))
					prefix.append(stack.pop()+" ");
				stack.push(split[i]);
			}
		}
		while (!stack.isEmpty()) {
			prefix.append(stack.pop()+" ");
		}

		return prefix.reverse().toString().trim();
	}
	
	public static void main(String[] args) {
		String postFix = "8 3 * 10 - 12 + 2 / 5 %";
		int resultPostFix = postfixEvaluation(postFix);
		System.out.println("Result of postfix : " + resultPostFix);

		String preFix = "% / + - * 8 3 10 12 2 5";
		int resultPrefix = prefixEvaluation(preFix);
		System.out.println("Result of prefix : " + resultPrefix);

		String inFix = "1 $ 9 + 3 * 4 - ( 6 + 18 / 2 ) + 7";
		String toPostFix = infixToPostfix(inFix);
		System.out.println("Infix to Postfix : "+toPostFix);
		
		String toPreFix = infixToPrefix(inFix);
		System.out.println("Infix to Postfix : "+toPreFix);
	}

}
