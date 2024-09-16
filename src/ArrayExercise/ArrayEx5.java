package ArrayExercise;

import java.util.Arrays;

public class ArrayEx5 {

	public static int[] removeDuplicates(int[] arr) {
		int count = 0;
		int[] returnValue = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;
			
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}

			}
			if (!duplicate)
				returnValue[count++] = arr[i];

		}
		return Arrays.copyOf(returnValue, count);

	}

	public static void main(String[] args) {

		int[] array = { 1, 1, 2, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(removeDuplicates(array)));
		
	// output should return remove duplicate elements from the given array
		
//		Write a function which takes integer array as a parameter 
//		and returns a new integer array with unique elements. (remove duplicates)
//
//		Example
//
//		removeDuplicates({1, 1, 2, 2, 3, 4, 5})
//		Output : [1, 2, 3, 4, 5]
	}
}
