package Recursion;

public class StringReversal {

	public static void main(String[] args) {

		String reverse = reverseString("hello");

		System.out.println(reverse);

	}

	private static String reverseString(String string) {

		if (string.isEmpty())
			return string;

		// Recursively reverse the rest of the string,
		// skipping the first character.
		
		// And adding the first character of string at the end.
		return reverseString(string.substring(1)) + string.charAt(0);
	}

}
