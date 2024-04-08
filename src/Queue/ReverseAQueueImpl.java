package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueueImpl {

	public void reverse(Queue<Integer> queue) {

		Stack<Integer> stack = new Stack<Integer>();

		while (!queue.isEmpty())
			stack.push(queue.remove());

		while (!stack.isEmpty())
			queue.add(stack.pop());

	}

	public Queue<Integer> reverseFirstKElements(Queue<Integer> queue, int k) {

		Stack<Integer> stack = new Stack<>();

		Queue<Integer> remainingQueue = new ArrayDeque<>(queue.size() - k);

		int count = 0;

		while (!queue.isEmpty())
			if (count++ < k)
				stack.push(queue.remove());
			else
				remainingQueue.add(queue.remove());

		while (!stack.isEmpty())
			queue.add(stack.pop());

		while (!remainingQueue.isEmpty())
			queue.add(remainingQueue.remove());

		return queue;

	}

}
