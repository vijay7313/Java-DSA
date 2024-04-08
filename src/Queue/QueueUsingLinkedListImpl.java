package Queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class QueueUsingLinkedListImpl<E> implements Queue<E> {

	private Node<E> first;
	private Node<E> last;
	private int size;

	public boolean add(E item) {

		linkLast(item);

		return true;
	}

	public boolean offer(E item) {

		return add(item);
	}

	public void linkLast(E item) {

		Node<E> node = new Node<>(item);

		if (isEmpty())
			first = last = node;
		else {
			last.next = node;
			last = node;
		}
		size++;
	}

	public E remove() {

		return removeFirst();
	}

	public E poll() {

		if (isEmpty())
			return null;

		return unLinkFirst();
	}

	public E removeFirst() {

		if (isEmpty())
			throw new NoSuchElementException();

		return unLinkFirst();
	}

	public E unLinkFirst() {

		E item = first.item;

		if (first == last)
			first = last = null;
		else
			first = first.next;

		size--;

		return item;
	}

	public E element() {

		if (isEmpty())
			throw new NoSuchElementException();

		return first.item;
	}

	public E peek() {

		if (isEmpty())
			return null;

		return first.item;
	}

	public boolean isEmpty() {

		return first == null;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		Object[] toArray = new Object[size];
		var current = first;
		int index = 0;
		while (current != null) {

			toArray[index++] = current.item;
			current = current.next;

		}
		return Arrays.toString(toArray);
	}

}
