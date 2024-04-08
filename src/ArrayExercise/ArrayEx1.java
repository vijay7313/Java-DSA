package ArrayExercise;

import java.util.Arrays;

public class ArrayEx1 {

	public static int[] middle(int[] array) {
		int[] returnValue = new int[array.length - 2];
		int count = 0;
		// TODO
		for (int i = 1; i < array.length - 1; i++)

			returnValue[count++] = array[i];

		return returnValue;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };

		System.out.println(Arrays.toString(middle(array)));

		
//		Write a function called middle that takes an array and 
//		returns a new array that contains all but the first and last elements.

//		myArray = [1, 2, 3, 4]
//		middle(myArray)  # [2,3]
	}
}
