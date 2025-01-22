package SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] nums = { 8, 2, 4, 1, 3 };
		selectionSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void selectionSort(int[] nums) {

		int length = nums.length;

		for (int i = 0; i < length; i++) {
			int minIndex = i;

			for (int j = i + 1; j < length; j++)
				if (nums[j] < nums[minIndex])
					minIndex = j;

			if (i != minIndex)
				swap(nums, i, minIndex);
		}

	}

	private static void swap(int[] nums, int index1, int index2) {

		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}
}
