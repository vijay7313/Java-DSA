package Recursion;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		for (int i = 1; i <= 5; i++)
			stack.push(i);

		System.out.println(stack);

		Stack<Integer> revStack = reverseAStack(stack);

		System.out.println(revStack);

	}

	private static Stack<Integer> reverseAStack(Stack<Integer> stack) {

		Stack<Integer> revStack = new Stack<>();

		recursionHelper(stack, revStack);

		return revStack;
	}

	private static void recursionHelper(Stack<Integer> stack, Stack<Integer> revStack) {
		{
			if (stack.isEmpty())
				return;

			revStack.push(stack.pop());

			recursionHelper(stack, revStack);
		}

	}

}
