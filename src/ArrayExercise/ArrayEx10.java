package ArrayExercise;

public class ArrayEx10 {

	public static String maxProduct(int[] array) {
		int maxProduct = 0;
		String pairs = "";
		for (int i = 0; i < array.length; i++)
			for (int j = i + 1; j < array.length; j++)
				if (array[i] * array[j] > maxProduct) {
					maxProduct = array[i] * array[j];
					pairs = Integer.toString(array[i]) + "," + Integer.toString(array[j]);
				}

		return pairs;

	}

	public static void main(String[] args) {
		int[] array = { 20, 50, 20, 70, 18, 30 };
		System.out.println(maxProduct(array));

//		How to find maximum product of two integers in the array
//		where all elements are positive.

//		Example

//		int[] intArray = {20, 50, 20, 70, 18, 30};
//		maxProduct(intArray) // (50,70)

	}
}
