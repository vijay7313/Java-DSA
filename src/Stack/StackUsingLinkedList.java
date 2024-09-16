package Stack;

import java.util.Arrays;

public class StackUsingLinkedList {

	private Node items;
	private int size;

	private class Node {

		private int item;
		private Node next;

		public Node(int item) {
			this.item = item;
			this.next = null;
		}

		public int getItem() {
			return item;
		}

		public void setItem(int item) {
			this.item = item;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	public void push(int item) {

		Node node = new Node(item);

		if (isEmpty())
			items = node;
		else {
			node.setNext(items);
			items = node;
		}
		size++;
	}

	public int pop() {

		if (isEmpty())
			throw new IllegalStateException();

		else {
			int top = items.getItem();
			items = items.getNext();
			size--;
			return top;
		}

	}

	public int peek() {
		if (isEmpty())
			throw new IllegalStateException();
		return items.getItem();

	}

	public boolean isEmpty() {
		return items == null;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		int[] array = new int[size];
		int index = size - 1;
		Node current = items;

		while (current != null) {
			array[index--] = current.getItem();
			current = current.getNext();
		}
		return Arrays.toString(array);

	}
}
