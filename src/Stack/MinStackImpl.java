package Stack;

import java.util.Stack;

public class MinStackImpl {

	private Stack<Integer> stack = new Stack<>();
	private Stack<Integer> minStack = new Stack<>();

	public void push(int item) {

		stack.push(item);

		if (minStack.isEmpty() || item <= minStack.peek())
			minStack.push(item);
	}

	public int pop() {

		int pop = stack.pop();

		if (pop == minStack.peek())
			minStack.pop();

		return pop;

	}

	public int minimum() {
		return minStack.peek();
	}
}
