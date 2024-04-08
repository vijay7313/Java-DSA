package Queue;

public class QueueusingStackMain {

	public static void main(String[] args) {

		QueueusingStackImpl queue = new QueueusingStackImpl();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

		queue.enqueue(50);

		System.out.println(queue.dequeue());

		System.out.println(queue.peek());

	}
}
