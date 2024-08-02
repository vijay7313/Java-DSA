package ArrayExercise;

public class SingleDimensionArray {
	int[] arr;

	int size;

	public SingleDimensionArray(int capacity) {

		arr = new int[capacity];

	}

	public void insert(int location, int value) {

		if (isFull())
			throw new ArrayIndexOutOfBoundsException();

		else {
			arr[location] = value;
			size++;
		}

	}

	public boolean isFull() {
		return size == arr.length;
	}
}
