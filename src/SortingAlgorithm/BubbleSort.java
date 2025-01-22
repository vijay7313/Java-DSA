package SortingAlgorithm;

public class BubbleSort {

	public static void bubbleSort(int[] nums) {
		boolean isSorted;
		int length = nums.length;

		for (int i = 0; i < length; i++) {
			isSorted = true;

			for (int j = 1; j < length - i; j++)
				if (nums[j] < nums[j - 1]) {
					SwapTwoItems.swap(nums, j, j - 1);
					isSorted = false;
				}

			if (isSorted)
				return;
		}

	}

}
