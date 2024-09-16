package ArrayExercise;

import java.util.Arrays;

public class ArrayEx8 {
	public static int[] twoSum(int[] array, int targetValue) {
		int count = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++)
				if (array[i] + array[j] == targetValue)
					return new int[] { i, j };
		}
		throw new IllegalArgumentException("No two sum solution found");

	}

	public static void main(String[] args) {
		int[] array = { 3, 2, 4 };
		int targetValue = 6;
		System.out.println(Arrays.toString(twoSum(array, targetValue)));

//		Given an array of integers nums and an integer target, 
//		return indices of the two numbers such that they add up to target.
//		You may assume that each input would have exactly one solution, 
//		and you may not use the same element twice.
//
//				Examples
//
//				Input: nums = [2,7,11,15], target = 9
//				Output: [0,1]
//				Output: Because nums[0] + nums[1] == 9, we return [0, 1]
//
//
//				Input: nums = [3,2,4], target = 6
//				Output: [1,2]

	}
}
