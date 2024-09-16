package Queue;

public interface Queue<E> {

	public boolean add(E item);

	public boolean offer(E item);

	public E remove();

	public E poll();

	public E element();

	public E peek();

	public int size();

}
