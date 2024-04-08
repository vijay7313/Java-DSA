package Queue;

public class QueueUsingLinkedListMain {

	public static void main(String[] args) {

		Queue<String> queue = new QueueUsingLinkedListImpl<>();

		queue.add("Data");
		queue.add("Structures");
		queue.offer("Algorithms");

		System.out.println(queue);

		Queue<Integer> queue1 = new QueueUsingLinkedListImpl<>();
		queue1.add(10);
		queue1.add(20);
		queue1.offer(30);
		queue1.add(40);

		System.out.println(queue1);
	}
}
