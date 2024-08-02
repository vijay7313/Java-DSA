package Recursion;

public class Factorial {
	public static void main(String[] args) {

		int response = multiplier(5);

		System.out.println(response);
	}

	public static int multiplier(int num) {

		int mul = 0;

		if (num == 0) // Base case
			return 1;

		mul = num * multiplier(num - 1); // Recursive case

		System.out.println(mul);

		return mul;

	}

}
