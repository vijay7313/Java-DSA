package ArrayExercise;

import java.util.Arrays;

public class ArrayEx3 {

	public static int[] findTopTwoScores(int[] array) {
		int firstBest = array[0]; // 84
		int secondBest = array[0]; // 84
		for (int i = 1; i < array.length; i++) {

			if (firstBest < array[i]) {
				secondBest = firstBest;
				firstBest = array[i];
			}
		}
		
		return new int[] {firstBest,secondBest};
	}

	public static void main(String[] args) {
		int[] array = { 84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0 };
		System.out.println(Arrays.toString(findTopTwoScores(array)));
		
		//output should return top 2 scores from the array
		//[90,87]
		
//				Given an array, write a function to get 
//				first, second best scores from the array and return it in new array.
//
//				Array may contain duplicates.
//
//				Example
//
//				myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
//				firstSecond(myArray) // {90, 87}
	}
}
