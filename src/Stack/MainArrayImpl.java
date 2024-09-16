package Stack;

public class MainArrayImpl {

	public static void main(String[] args) {

		StackUsingArray stack = new StackUsingArray();

		System.out.println(stack.isEmpty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println(stack.isEmpty());
		System.out.println(stack.toString());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack);

	}

}
