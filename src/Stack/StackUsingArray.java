package Stack;

import java.util.Arrays;

public class StackUsingArray {

	private int index;
	private int[] items = new int[5];

	public void push(int item) {

		if (isFull())
			throw new StackOverflowError();

		items[index++] = item;

	}

	public int pop() {

		if (isEmpty())
			throw new IllegalStateException();

		return items[--index];

	}

	public int peek() {

		if (isEmpty())
			throw new IllegalStateException();

		return items[index - 1];
	}

	public boolean isEmpty() {
		return index == 0;
	}

	public boolean isFull() {
		return index == items.length;
	}

	@Override
	public String toString() {

		var content = Arrays.copyOfRange(items, 0, index);
		return Arrays.toString(content);

	}

}
