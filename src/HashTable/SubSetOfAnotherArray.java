package HashTable;

import java.util.HashMap;
import java.util.Map;

public class SubSetOfAnotherArray {

	public static void main(String[] args) {

		String str = "abcabcbb";

		var result = lengthOfLongestSubstring(str);

		System.out.println(result);

	}

	private static int lengthOfLongestSubstring(String str) {

		Map<Character, Integer> map = new HashMap<>();
		int count = 0;
		for (var chars : str.toCharArray()) {

			if (map.containsKey(chars))
				return count;

			map.put(chars, 1);
			count++;
		}
		return 0;
	}
}
