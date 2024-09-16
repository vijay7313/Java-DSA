package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList<E> {

	private Node first;
	private Node last;
	private int size;

	// addLast
	public void addLast(int value) {

		var node = new Node(value);

		if (isEmpty())
			first = last = node;
		else {
			last.setNext(node);
			last = node;
		}
		size++;

	}

	// addFirst
	public void addFirst(int value) {

		var node = new Node(value);

		if (isEmpty())
			first = last = node;
		else {
			node.setNext(first);
			first = node;
		}
		size++;
	}

	// indexOf
	public int indexOf(E i) {

		int index = 0;
		Node current = first;

		while (current != null) {

			if (current.getValue() == i)
				return index;

			current = current.getNext();
			index++;

		}
		return -1;

	}

	// contains
	public boolean contains(E value) {
		return indexOf(value) != -1;
		// if -1 means the value is not in the list
		// any number != -1 true
		// -1 != -1 // false

	}

	// removeFirst
	public void removeFirst() {

		if (isEmpty())
			throw new NoSuchElementException();

		if (first == last)
			first = last = null;
		else {
			Node second = first.getNext();
			first = second;
		}
		size--;
	}

	// removeLast
	public void removeLast() {

		if (isEmpty())
			throw new NoSuchElementException();

		if (first == last)
			first = last = null;

		else {
			Node previous = getPreviousOfLastNode();
			last = previous;
			last.setNext(null);
		}
		size--;
	}

	private Node getPreviousOfLastNode() {

		Node current = first;

		while (current != null) {

			if (current.getNext() == last)
				return current;

			current = current.getNext();

		}
		return null;
	}

	// get size
	public int size() {
		return size;
	}

	// reverse
	public void reverse() {

		if (isEmpty())
			return;

		var previous = first;
		var current = first.getNext();

		while (current != null) {

			Node next = current.getNext();
			current.setNext(previous);

			previous = current;
			current = next;
		}

		last = first;
		last.setNext(null);
		first = previous;

	}

	// toArray
	public Object[] toArray() {
		Object[] array = new Object[size];
		Node current = first;
		int index = 0;
		while (current != null) {
			array[index++] = current.getValue();
			current = current.getNext();
		}
		return array;

	}

	// printMiddle
	public void printMiddle() {

		if (isEmpty())
			throw new NoSuchElementException();

		var a = first;
		var b = first;

		while (b != last && b.getNext() != last) {
			a = a.getNext();
			b = b.getNext().getNext();
		}

		if (b == last)
			System.out.println(a.getValue());
		else
			System.out.println(a.getValue() + ", " + a.getNext().getValue());

	}

	// create a loop in single LinkedList
	public void createWithLoop() {

		if (first != null && first.getNext() != null)

			last.setNext(first.getNext());

	}

	// Check weather LinkedList has loop or not
	public boolean hasLoop() {

		var slower = first;
		var faster = first;

		while (faster != null && faster.getNext() != null) {

			slower = slower.getNext();
			faster = faster.getNext().getNext();

			if (slower == faster)
				return true;
		}
		return false;

	}

	// get k'th Node's value from the end of the LinkedList
	public E getKthFromTheEnd(int k) {

		if (isEmpty())
			throw new IllegalStateException();

		Node slower = first;
		Node faster = first;

		for (int i = 0; i < k - 1; i++) {

			faster = faster.getNext();

			if (faster == null)
				throw new IllegalArgumentException();
		}

		while (faster != last) {

			slower = slower.getNext();
			faster = faster.getNext();
		}

		return (E) slower.getValue();
	}

	// Check weather first node empty or not
	private boolean isEmpty() {

		return first == null;
	}

}
