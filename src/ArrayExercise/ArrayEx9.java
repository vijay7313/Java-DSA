package ArrayExercise;

public class ArrayEx9 {

	public static int searchInArray(int[] array, int findNumber) {

		for (int i = 0; i < array.length; i++)
			if (array[i] == findNumber)
				return i;
		throw new IllegalArgumentException("Value not found in given array");

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		int findNumber = 5;
		System.out.println(searchInArray(array, findNumber));
		
//		Write a program to to check if an array contains a number in Java.
//
//		int[] intArray = {1,2,3,4,5,6};
//		searchInArray(intArray, 6); 
//      index -> 5 
	}
}
