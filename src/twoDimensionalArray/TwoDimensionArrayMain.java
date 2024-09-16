package twoDimensionalArray;

import java.util.Arrays;

public class TwoDimensionArrayMain {
	public static void main(String[] args) {
		int array2D[][] = new int[2][4];
		array2D[0][0] = 1;
		array2D[0][1] = 2;
		array2D[1][0] = 3;
		array2D[1][1] = 4;
		System.out.println(Arrays.deepToString(array2D));

		String stringArray2D[][] = new String[2][2];
		stringArray2D[0][0] = "vijay";
		stringArray2D[0][1] = "raja";
		stringArray2D[1][0] = "mathan";
		stringArray2D[1][1] = "kumar";
		
		System.out.println(Arrays.deepToString(stringArray2D));
		
		
	}

}
