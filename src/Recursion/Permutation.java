package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	// Function to convert number into list of digits
	public static List<Integer> getDigits(int number) {
		List<Integer> digits = new ArrayList<>();
		while (number > 0) {
			digits.add(0, number % 10);
			number /= 10;
		}
		return digits;
	}

	public static int findPermutations(List<Integer> digits, String currentPermutation) {
		if (digits.isEmpty()) {
			System.out.println(currentPermutation);
			return 1;
		}
		int count = 0;
		for (int i = 0; i < digits.size(); i++) {

			List<Integer> remainingDigits = new ArrayList<>(digits);

			int chosenDigit = remainingDigits.remove(i);

			count += findPermutations(remainingDigits, currentPermutation + chosenDigit);
		}

		return count;
	}

	public static void main(String[] args) {
		int number = 123; // Example number
		List<Integer> digits = getDigits(number);
		int c = findPermutations(digits, "");

		System.out.println(c);

	}
}
