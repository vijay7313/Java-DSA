package twoDimensionalArray;

import java.util.Arrays;

public class twoDArray3 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotateMatrix(matrix);
		System.out.println(Arrays.deepToString(matrix));

	}

	public static void rotateMatrix(int[][] matrix) {
		int temp = 0;
		for (int i = 0; i < matrix.length; i++)
			for (int j = i + 1; j < matrix[0].length; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;

			}

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

//	Given an image represented by an NxN matrix write a method 
//	to rotate the image by 90 degrees.
//
//	You have to rotate the image in-place, which means you have 
//	to modify the input 2D matrix directly.
//
//	DO NOT allocate another 2D matrix and do the rotation.

}
