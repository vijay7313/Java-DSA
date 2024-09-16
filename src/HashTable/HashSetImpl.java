package HashTable;

import java.util.HashMap;

public class HashSetImpl {

	private transient HashMap<Integer, Object> map;

	private static final Object PRESENT = new Object();

	public HashSetImpl() {
		map = new HashMap<>();
	}

	public boolean add(int element) {

		return map.put(element, PRESENT) == null;

	}

	public boolean contains(int element) {

		return map.containsKey(element);
	}

	public boolean remove(int element) {

		return map.remove(element) == PRESENT;

	}

	public boolean isEmpty() {
		return map.isEmpty();

	}

	public int size() {
		return map.size();
	}
}
