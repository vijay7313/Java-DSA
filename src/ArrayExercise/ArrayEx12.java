package ArrayExercise;

public class ArrayEx12 {

	public static boolean isPermutation(int[] array1, int[] array2) {
		int sumOfArray1 = 0;
		int sumOfArray2 = 0;
		int multiplyOfArray1 = 0;
		int multiplyOfArray2 = 0;
		if (array1.length != array2.length)
			return false;
		for (int i = 0; i < array1.length; i++) {
			sumOfArray1 += array1[i];
			sumOfArray2 += array2[i];
			multiplyOfArray1 *= array1[i];
			multiplyOfArray2 *= array2[i];
		}
		if (sumOfArray1 == sumOfArray2 && multiplyOfArray1 == multiplyOfArray2)
			return true;

		return false;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 5, 1, 2, 3, 4 };
		System.out.println(isPermutation(array1, array2));

//		Your are given two integer arrays. Write a program to 
//		check if they are permutation of each other.

//		Example

//		int[] array1 = {1,2,3,4,5};
//		int[] array2 = {5,1,2,3,4};
//		permutation(array1, array2)
//		Output

//		true

	}
}
