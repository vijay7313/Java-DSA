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

		Entry entry = getEntry(key);

		if (entry != null) {
			entry.value = value;
			return;
		}

		LinkedList<Entry> bucket = getOrCreateBucket(key);

		bucket.add(new Entry(key, value));
	}

	public String get(int key) {

		Entry entry = getEntry(key);

		return (entry == null) ? null : entry.value;

	}

	public void remove(int key) {

		Entry entry = getEntry(key);

		if (entry == null)
			throw new IllegalStateException();

		LinkedList<Entry> bucket = getBucket(key);

		bucket.remove(entry);

	}

	private LinkedList<Entry> getOrCreateBucket(int key) {

		int index = hashFunction(key);

		LinkedList<Entry> bucket = entries[index];

		if (bucket == null)
			bucket = entries[index] = new LinkedList<>();

		return bucket;

	}

	private LinkedList<Entry> getBucket(int key) {

		return entries[hashFunction(key)];

	}

	private Entry getEntry(int key) {

		LinkedList<Entry> bucket = getBucket(key);

		if (bucket != null)
			for (Entry entry : bucket)
				if (entry.key == key)
					return entry;

		return null;

	}

	private int hashFunction(int key) {

		return key % capacity;
	}

}
