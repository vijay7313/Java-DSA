package twoDimensionalArray;

import java.util.Arrays;

public class twoDArray2 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		reverse(matrix);
		System.out.println(Arrays.deepToString(matrix));

	}

	public static void reverse(int[][] matrix) {
		int temp = 0;

		for (int i = 0; i < matrix.length; i++) {
			int start = 0;
			int end = matrix[0].length - 1;
			while (start < end) {
				temp = matrix[i][start];
				matrix[i][start] = matrix[i][end];
				matrix[i][end] = temp;
				start++;
				end--;
			}
		}
	}

//	Reverse the every single row in a 2D array.
//
//	DO NOT allocate another 2D matrix and do the rotation.

}
