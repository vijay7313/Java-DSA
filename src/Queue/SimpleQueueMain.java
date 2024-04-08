package Queue;

public class SimpleQueueMain {

	public static void main(String[] args) {

		SimpleQueueImpl queue = new SimpleQueueImpl(5);

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		System.out.println(queue.peek());
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println(queue.peek());
//		queue.enqueue(60);

		System.out.println(queue);

	}
}
