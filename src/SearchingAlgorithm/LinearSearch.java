package SearchingAlgorithm;

public class LinearSearch {

	public static void main(String[] args) {

		int[] nums = { 3, 4, 7, 8, 1, 5, };

		int index = linearSearch(nums, 8);

		System.out.println(index);
	}

	public static int linearSearch(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++)
			if (nums[i] == target)
				return i;

		return -1;
	}

}
