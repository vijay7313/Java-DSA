package Recursion;

public class Main {

	public static void main(String[] args) {

		int response = multiplier(4);

		System.out.println(response);
	}

	public static int multiplier(int n) {

		int mul = 0;

		if (n == 0)
			return 1;

		mul = n * multiplier(n-1);
		
		System.out.println(n);

		return mul;

	}
}
