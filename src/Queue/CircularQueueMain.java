package Queue;

public class CircularQueueMain {

	public static void main(String[] args) {

		CircularQueueImpl queue = new CircularQueueImpl(5);

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		System.out.println(queue.peek());
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println(queue.peek());
		queue.enqueue(60);
		queue.enqueue(12);

		System.out.println(queue);

	}
}
