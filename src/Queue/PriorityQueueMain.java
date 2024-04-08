package Queue;

public class PriorityQueueMain {

	public static void main(String[] args) {
		PriorityQueueImpl queue = new PriorityQueueImpl(4);

		queue.enqueue(7);
		queue.enqueue(3);
		queue.enqueue(5);
		queue.enqueue(2);

		// [2,3,5,7]
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
//		System.out.println(queue.dequeue());

		System.out.println(queue);

	}
}
