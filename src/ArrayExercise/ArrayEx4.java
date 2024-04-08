package ArrayExercise;

public class ArrayEx4 {

	static int findMissingNumberInArray(int[] arr) {

		int n = arr.length + 1;

		int sumOfLinearArr = (n * (n + 1)) / 2;

		int sumOfGivenArray = 0;

		for (int number:arr)

			sumOfGivenArray += number;

		return sumOfLinearArr - sumOfGivenArray;

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6 };
		System.out.println(findMissingNumberInArray(array));

		// output should return missing element in array
		
//		Write Java function called findMissingNumberInArray that takes
//		an integer array containing n-1 unique elements from a range of 1 to n,
//		with one missing number, and returns the missing number.
//
//		Example
//
//		myArray = {1,2,3,4,6}
//		findMissingNumberInArray(myArray, 6) // 5
		
		
	}
}
