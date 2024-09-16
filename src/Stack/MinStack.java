package Stack;

public class MinStack {

	public static void main(String[] args) {

		MinStackImpl stack = new MinStackImpl();

		stack.push(5);
		stack.push(2);
		stack.push(10);
		stack.push(1);

		System.out.println(stack.minimum());

		stack.pop();

		System.out.println(stack.minimum());

	}
}
