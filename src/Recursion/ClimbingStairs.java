package Recursion;

public class ClimbingStairs {

	public static void main(String[] args) {

		int steps = 5;

		System.out.println(climbStairs(steps));
	}

	public static int climbStairs(int n) {

		if (n <= 1) // Base case
			return 1;

		return climbStairs(n - 1) + climbStairs(n - 2); // Recursive case
	}

}
