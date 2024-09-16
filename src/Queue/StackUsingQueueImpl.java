package Queue;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsingQueueImpl {

	Queue<Integer> queue1 = new ArrayDeque<>();

	Queue<Integer> queue2 = new ArrayDeque<>();

	int size;

	public void push(int item) {
		queue1.add(item);
		size++;
	}

	public int pop() {

		while (queue1.size() > 1)
			queue2.add(queue1.remove());

		int pop = queue1.remove();

		size--;

		queue1 = queue2;

		queue2 = new ArrayDeque<>();

		return pop;

	}

	public int peek() {

		if (isEmpty())
			throw new NoSuchElementException();

		while (queue1.size() > 1)
			queue2.add(queue1.remove());

		int peek = queue1.remove();

		queue2.add(peek);

		queue1 = queue2;

		queue2 = new ArrayDeque<>();

		return peek;

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return queue1.isEmpty();
	}

}
