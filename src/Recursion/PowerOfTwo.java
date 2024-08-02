package Recursion;

public class PowerOfTwo {
	public static void main(String[] args) {

		System.out.println(isPowerOfTwo(16));
		System.out.println(isPowerOfTwo(18));
		System.out.println(isPowerOfTwo(9));
		System.out.println(isPowerOfTwo(1));

	}

	public static boolean isPowerOfTwo(int n) {

		if (n < 1)
			return false;

		if (n == 1) // Base case
			return true;

		if (n % 2 == 0)
			return isPowerOfTwo(n / 2); // Recursive case
		else
			return false;

	}
}
