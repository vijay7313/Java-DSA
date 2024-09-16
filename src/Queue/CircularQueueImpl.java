package Queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CircularQueueImpl {

	private int[] items;
	private int itemsCount;
	private int front;
	private int rear;

	public CircularQueueImpl(int capacity) {
		items = new int[capacity];
	}

	public void enqueue(int item) {

		if (isFull())
			throw new IllegalStateException();

		items[rear] = item;
		rear = (rear + 1) % items.length;
		itemsCount++;
	}

	public int dequeue() {

		if (isEmpty())
			throw new NoSuchElementException();

		int item = items[front];
		items[front] = 0;
		front = (front + 1) % items.length;
		itemsCount--;

		return item;

	}

	public int peek() {
		if (isEmpty())
			throw new NoSuchElementException();

		return items[front];
	}

	public boolean isFull() {
		return itemsCount == items.length;
	}

	public boolean isEmpty() {
		return itemsCount == 0;
	}

	@Override
	public String toString() {
		return Arrays.toString(items);
	}
}
