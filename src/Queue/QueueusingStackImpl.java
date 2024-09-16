package Queue;

import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueusingStackImpl {

	Stack<Integer> inputStack = new Stack<>();

	Stack<Integer> outputStack = new Stack<>();

	public void enqueue(int item) {

		inputStack.push(item);
	}

	public int dequeue() {

		if (isEmpty())
			throw new NoSuchElementException();

		ensureOutputStackFilled();

		return outputStack.pop();

	}

	public int peek() {

		if (isEmpty())
			throw new NoSuchElementException();

		ensureOutputStackFilled();

		return outputStack.peek();

	}

	private void ensureOutputStackFilled() {

		if (outputStack.isEmpty())
			while (!inputStack.isEmpty())
				outputStack.push(inputStack.pop());

	}

	public boolean isEmpty() {
		return inputStack.isEmpty() && outputStack.isEmpty();
	}

}
