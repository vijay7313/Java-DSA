package Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {

	private final List<Character> leftBrackets = Arrays.asList('(', '[', '{', '<');

	private final List<Character> rightBrackets = Arrays.asList(')', ']', '}', '>');

	public boolean isBalanced(String input) {

		Stack<Character> stack = new Stack<>();

		for (char ch : input.toCharArray())

			if (leftBrackets.contains(ch))
				stack.push(ch);

			else

			if (stack.isEmpty())
				return false;

			else if (!bracketMatch(stack.pop(), ch))
				return false;

		return stack.isEmpty();
	}

	private boolean bracketMatch(char left, char right) {
		return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
	}
}
