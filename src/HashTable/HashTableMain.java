package HashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableMain {

	public static void main(String[] args) {

		HashMapImpl hash = new HashMapImpl(5);

//		Map<Integer, String> hash = new HashMap<>();

		hash.put(1, "apple");

		hash.put(23, "orange");

		hash.put(11, "lemon");

		hash.put(1, "mango");

		hash.put(22, "watermelon");

		hash.put(3, "pomegranate");

//		for (Entry<Integer, String> entry : hash.entrySet())
//			System.out.println(entry);

		System.out.println(hash.get(3));

		hash.remove(3);

		System.out.println(hash.get(3));
	}
}
