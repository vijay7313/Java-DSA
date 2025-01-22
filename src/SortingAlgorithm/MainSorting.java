package SortingAlgorithm;

import java.util.Arrays;

public class MainSorting {

	public static void main(String[] args) {
		int[] nums = { 8, 2, 4, 1, 3 };

//		BubbleSort.bubbleSort(nums);
//
//		SelectionSort.selectionSort(nums);

		InsertionSort.insertionSort(nums);

		System.out.println(Arrays.toString(nums));
	}

}
