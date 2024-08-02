package HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindChar {

	public char findFirstNonRepeatingChar(String str) {

		Map<Character, Integer> map = new HashMap<>();

		var chars = str.toCharArray();

		for (var ch : chars) {
			var count = map.containsKey(ch) ? map.get(ch) : 0;

			map.put(ch, count + 1);
		}

		System.out.println(map);

		for (var ch : chars)
			if (map.get(ch) == 1)
				return ch;

		return Character.MIN_VALUE;

	}

	public char findFirstRepeatingChar(String str) {

		Set<Character> set = new HashSet<>();

		var chars = str.toCharArray();

		for (var ch : chars) {
			if (set.contains(ch))
				return ch;
			set.add(ch);
		}

		return Character.MIN_VALUE;

	}
}
