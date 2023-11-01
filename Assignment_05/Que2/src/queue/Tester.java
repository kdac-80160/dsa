package queue;

public class Tester {

	public static void main(String[] args) {
		QueueUsingList queue = new QueueUsingList();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		
		queue.peek();
		queue.pop();
		queue.peek();
	}

}
