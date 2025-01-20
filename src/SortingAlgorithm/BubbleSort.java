package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = { 8, 2, 4, 1, 3 };
		bubbleSort(nums);
		System.out.println(Arrays.toString(nums));

	}

	public static void bubbleSort(int[] nums) {
		boolean sorted;
		int length = nums.length;

		for (int i = 0; i < length; i++) {
			sorted = true;

			for (int j = 1; j < length - i; j++)
				if (nums[j] < nums[j - 1]) {
					swap(nums, j, j - 1);
					sorted = false;
				}

			if (sorted)
				return;
		}

	}

	private static void swap(int[] nums, int index1, int index2) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}
}
