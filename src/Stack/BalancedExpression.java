package Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {

	private final List<Character> leftBrackets = Arrays.asList('(', '[', '{', '<');

	private final List<Character> rightBrackets = Arrays.asList(')', ']', '}', '>');

	public boolean isBalanced(String input) {

		Stack<Character> stack = new Stack<>();

		for (char ch : input.toCharArray()) {

			if (isLeftBracket(ch)) {
				stack.push(ch);
				continue;
			}

			if (isRightBracket(ch)) {

				if (stack.isEmpty())
					return false;

				char top = stack.pop();

				if (!bracketMatch(top, ch))
					return false;
			}

		}
		return stack.isEmpty();
	}

	private boolean isLeftBracket(char ch) {

		return leftBrackets.contains(ch);
	}

	private boolean isRightBracket(char ch) {

		return rightBrackets.contains(ch);
	}

	private boolean bracketMatch(char left, char right) {
		return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
	}
}
