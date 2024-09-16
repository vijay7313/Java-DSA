package LinkedList;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();

		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);

		list.removeFirst();

		list.addFirst(5);
		list.addFirst(2);
		list.addFirst(22);

		list.removeLast();

		System.out.println(list.getKthFromTheEnd(4));

		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));

//		list.reverse();

//		int[] array1 = list.toArray();
//		System.out.println(Arrays.toString(array1));

//		System.out.println("size " + list.size());
//
//		System.out.println(list.indexOf(2));
//		System.out.println(list.contains(2));

//		list.printMiddle();

//		list.createWithLoop();
//
//		System.out.println(list.hasLoop());
	}
}
