package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeMain {

	public static void main(String[] args) {

		Deque<Integer> deque = new ArrayDeque<>();

		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(10);
		queue.add(20);
		System.out.println(queue.size());
		

	}

}
