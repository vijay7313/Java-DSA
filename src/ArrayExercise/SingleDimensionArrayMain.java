package ArrayExercise;

import java.util.Arrays;

public class SingleDimensionArrayMain {
	public static void main(String[] args) {
		SingleDimensionArray obj=new SingleDimensionArray(3);
		
		obj.insert(0, 2);
		obj.insert(1, 3);
		obj.insert(2, 4);
		obj.insert(2, 4);
		obj.insert(3, 3);
		
		System.out.println(Arrays.toString(obj.arr));
	}
}
