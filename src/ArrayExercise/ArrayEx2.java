package ArrayExercise;


public class ArrayEx2 {
	 public static int sumDiagonalElements(int[][] array) {
		 int sum=0;
		 for(int i=0;i<array.length;i++) {
			 for(int j=0;j<array[0].length;j++) {
				 if(i==j)
					 sum+=array[i][j];
			 }
		 }
		return sum;
		 
		 
	    }
	
	public static void main(String[] args) {

		int[][] array2D= {{1,2,3},{4,5,6},{7,8,9}};
	System.out.println(sumDiagonalElements(array2D));
	
	//output should sum the elements of 00 ,11,22
	// Here array[0][0] =1
	// Here array[1][1] =5
	// Here array[2][2] =9
	// sum is 1 + 5 + 9 =15
	
	
//	Given 2D array calculate the sum of diagonal elements.
//
//	Example
//
//	myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
//	 
//	sumDiagonalElements(myArray2D) # 15
	}
}
