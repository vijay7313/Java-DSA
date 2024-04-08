package ArrayExercise;

import java.util.Arrays;

public class ArrayEx6 {

	public static int removeDuplicates(int[] nums) {

		int count = 0;

		for (int i = 0; i < nums.length; i++) {

			if (i < nums.length - 1 && nums[i] == nums[i + 1])
				continue;

			nums[count++] = nums[i];
			
		}
		nums=Arrays.copyOf(nums, count);
		
		return count;

	}

	public static void main(String[] args) {

		int[] array = { 1, 1, 2, 2, 3, 4, 5 };

		System.out.println(removeDuplicates(array));
		
		// output should return remove duplicate elements from the linear array
		
//		Given a sorted array nums, remove the duplicates
//		in-place such that each element appears only once and returns the new length. 
//		Do not allocate extra space for another array; you must do this by modifying
//		the input array in-place with O(1) extra memory.
//
//				Example:
//
//				Input: nums = [1, 1, 2] 
//				Output: 2

	}
}
