package Recursion;

public class DigitSumCalculator {

	public static void main(String[] args) {

		int sum = sumOfDigits(1234);

		System.out.println(sum);
	}

	private static int sumOfDigits(int digits) {

		if (digits == 0)
			return 0;

		return (digits % 10) + sumOfDigits(digits / 10);
	}
}
