package SortingAlgorithm;

public class InsertionSort {

	public static void insertionSort(int[] nums) {

		for (int i = 1; i < nums.length; i++) {

			int current = nums[i];
			int j = i - 1;

			while (j >= 0 && current < nums[j]) {
				nums[j + 1] = nums[j];
				j--;
			}
			nums[j + 1] = current;

		}
	}
}
