package SortingAlgorithm;

public class SelectionSort {

	public static void selectionSort(int[] nums) {

		int length = nums.length;

		for (int i = 0; i < length; i++) {
			int minIndex = i;

			for (int j = i + 1; j < length; j++)
				if (nums[j] < nums[minIndex])
					minIndex = j;

			if (i != minIndex)
				SwapTwoItems.swap(nums, i, minIndex);
		}

	}

}
