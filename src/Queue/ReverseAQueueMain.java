package Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class ReverseAQueueMain {
	public static void main(String[] args) {

		ReverseAQueueImpl reverseAQueue = new ReverseAQueueImpl();

		Queue<Integer> queue = new ArrayDeque<>(Arrays.asList(10, 20, 30, 40, 50));

		int k = 3;

		System.out.println(queue);

		reverseAQueue.reverseFirstKElements(queue, k);

		System.out.println(queue);

	}
}
