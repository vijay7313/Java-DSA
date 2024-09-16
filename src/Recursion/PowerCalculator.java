package Recursion;

public class PowerCalculator {

	public static void main(String[] args) {

		int result = powerOfNumber(2, 3);

		System.out.println(result);
	}

	private static int powerOfNumber(int number, int power) {

		if (power == 0)
			return 1;

		if (power == 1)
			return number;

		return number * powerOfNumber(number, power - 1);
	}
}
