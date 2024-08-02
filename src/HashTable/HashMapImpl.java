package HashTable;

import java.util.LinkedList;

public class HashMapImpl {

	private int capacity;

	LinkedList<Entry>[] entries;

	public HashMapImpl(int capacity) {

		this.capacity = capacity;

		entries = new LinkedList[capacity];
	}

	private class Entry {

		private int key;
		private String value;

		public Entry(int key, String value) {
			this.key = key;
			this.value = value;
		}

	}

	public void put(int key, String value) {

		var entry = getEntry(key);

		if (entry != null) {
			entry.value = value;
			return;
		}

		var bucket = getOrCreateBucket(key);

		bucket.add(new Entry(key, value));
	}

	public String get(int key) {

		var entry = getEntry(key);

		return (entry == null) ? null : entry.value;

	}

	public void remove(int key) {

		var entry = getEntry(key);

		if (entry == null)
			throw new IllegalStateException();

		var bucket = getBucket(key);

		bucket.remove(entry);

	}

	private LinkedList<Entry> getOrCreateBucket(int key) {

		var index = hashFunction(key);

		var bucket = entries[index];

		if (bucket == null)
			bucket = entries[index] = new LinkedList<>();

		return bucket;

	}

	private LinkedList<Entry> getBucket(int key) {

		return entries[hashFunction(key)];

	}

	private Entry getEntry(int key) {

		var bucket = getBucket(key);

		if (bucket != null)
			for (var entry : bucket)
				if (entry.key == key)
					return entry;

		return null;

	}

	private int hashFunction(int key) {

		return key % capacity;

	}

}
