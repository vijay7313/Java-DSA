package SearchingAlgorithm;

public class BinarySearch {

	public static void main(String[] args) {

		int[] nums = { 3, 5, 6, 9, 11, 18, 20, 21, 24, 30 };

		int target = 6;

		int index;

//		index = recursiveApproach(nums, target);

		index = iterativeApproach(nums, target);

		System.out.println(index);
	}

	public static int recursiveApproach(int[] nums, int target) {
		return recursiveApproach(nums, 0, nums.length - 1, target);
	}

	private static int recursiveApproach(int[] nums, int start, int end, int target) {

		if (end < start)
			return -1;

		int middle = (start + end) / 2;

		if (nums[middle] == target)
			return middle;

		if (target < nums[middle])
			return recursiveApproach(nums, start, middle - 1, target);
		else
			return recursiveApproach(nums, middle + 1, end, target);

	}

	private static int iterativeApproach(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {

			int middle = (start + end) / 2;

			if (nums[middle] == target)
				return middle;

			if (target < nums[middle])
				end = middle - 1;
			else
				start = middle + 1;
		}
		return -1;
	}

}
