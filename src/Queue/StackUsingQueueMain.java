package Queue;

public class StackUsingQueueMain {

	public static void main(String[] args) {
		StackUsingQueueImpl stack = new StackUsingQueueImpl();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println(stack.pop()); // 40
		System.out.println(stack.peek()); // 30
		System.out.println(stack.pop()); // 30

		stack.push(50);

		System.out.println(stack.pop()); // 50

		System.out.println(stack.pop()); // 20

		System.out.println(stack.pop()); // 10

		System.out.println(stack.peek());

		System.out.println(stack);
	}

}
