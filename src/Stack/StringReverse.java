package Stack;

import java.util.Stack;

public class StringReverse {

	public String reverse(String input) {

		Stack<Character> stack = new Stack<>();

		
		for (char ch : input.toCharArray())
			stack.push(ch);

		StringBuffer reverseString = new StringBuffer();

		while (!stack.isEmpty())
			reverseString.append(stack.pop());

		return reverseString.toString();

	}

}