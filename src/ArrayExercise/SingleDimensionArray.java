package ArrayExercise;

public class SingleDimensionArray {
	int arr[] = null;

	public SingleDimensionArray(int arraySize) {

		arr = new int[arraySize];

	}

	public void insert(int location, int value) {
		try {

			if (arr[location] == 0)
				arr[location] = value;
			else
				System.out.println("This cell already occupied!");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access the array!");
		}
	}
}
