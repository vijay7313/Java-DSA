package Queue;

import java.util.Arrays;

public class PriorityQueueImpl {

	private int[] items;
	private int itemsCapacity;
	private int itemsCount;
	private int front;

	public PriorityQueueImpl(int capacity) {

		items = new int[capacity];
		this.itemsCapacity = capacity;

	}

	public void enqueue(int item) {

		if (isFull())
			throw new IllegalStateException();

		var index = shiftItemsToInsert(item);
		items[index] = item;
		itemsCount++;

	}

	public int shiftItemsToInsert(int item) {
		int index;
		for (index = itemsCount - 1; index >= 0; index--)

			if (items[index] > item)
				items[index + 1] = items[index];
			else
				break;

		return index + 1;
	}

	public int dequeue() {

		if (isEmpty())
			throw new IllegalStateException();

		var item = items[front];
		items[front++] = 0;
		itemsCount--;

		return item;
	}

	public int peek() {

		if (isEmpty())
			throw new IllegalStateException();

		return items[front];
	}

	public boolean isEmpty() {
		return itemsCount == 0;
	}

	public boolean isFull() {
		return itemsCount == itemsCapacity;
	}

	@Override
	public String toString() {
		return Arrays.toString(items);
	}
}
