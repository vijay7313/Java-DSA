package SortingAlgorithm;

public class MergeSort {

	public static void sort(int[] nums) {

		if (nums.length < 2)
			return;

		int middle = nums.length / 2;

		int[] left = new int[middle];

		int[] right = new int[nums.length - middle];

		for (int i = 0; i < middle; i++)
			left[i] = nums[i];

		for (int i = middle; i < nums.length; i++)
			right[i - middle] = nums[i];

		sort(left);
		sort(right);

		merge(left, right, nums);
	}

	private static void merge(int[] left, int[] right, int[] nums) {

		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length)

			if (left[i] <= right[j])
				nums[k++] = left[i++];
			else
				nums[k++] = right[j++];

		while (i < left.length)
			nums[k++] = left[i++];

		while (j < right.length)
			nums[k++] = right[j++];

	}
}
