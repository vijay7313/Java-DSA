package twoDimensionalArray;

import java.util.Arrays;

public class twoDArray1 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		swap(matrix);
		System.out.println(Arrays.deepToString(matrix));

	}

	public static void swap(int[][] matrix) {
		int temp = 0;
		for (int i = 0; i < matrix.length; i++)
			for (int j = i + 1; j < matrix[0].length; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;

			}

	}

//	Change rows into columns and columns into rows

//	DO NOT allocate another 2D matrix.

}
