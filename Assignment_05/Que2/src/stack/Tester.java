package stack;

public class Tester {

	public static void main(String[] args) {
		StackUsingList stack = new StackUsingList();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.peek();
		stack.pop();
		stack.peek();
	}

}
