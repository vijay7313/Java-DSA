package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashTableExercise {

	public static void main(String[] args) {
		String[] array = { "eat", "tea", "tan", "ate", "nat", "bat" };

		var result = groupOfAnagrams(array);

//		System.out.println(result);

		var areAnagram = areAnagrams("aabbcc", "baccab");

//		System.out.println(areAnagram);

		String str = "loveleetcode";

		int firstUniqueChar = indexOfFirstUniqueCharInArray(str);

		System.out.println(firstUniqueChar);
	}

	private static Map<String, ArrayList<String>> groupOfAnagrams(String[] array) {

		Map<String, ArrayList<String>> map = new HashMap<>();

		for (String arr : array) {

			String sortedStr = checkSortedString(arr);

			map.putIfAbsent(sortedStr, new ArrayList<>());

			map.get(sortedStr).add(arr);

		}

		return map;
	}

	private static String checkSortedString(String word) {

		var chars = word.toCharArray();

		Arrays.sort(chars);

		return new String(chars);

	}

	private static boolean areAnagrams(String str1, String str2) {

		if (str1.length() != str2.length())
			return false;

		Map<Character, Integer> map1 = new HashMap<>();

		Map<Character, Integer> map2 = new HashMap<>();

		for (var chars : str1.toCharArray())
			map1.put(chars, map1.getOrDefault(chars, 0) + 1);

		for (var chars : str2.toCharArray())
			map2.put(chars, map2.getOrDefault(chars, 0) + 1);

		return map1.equals(map2);

	}

	private static int indexOfFirstUniqueCharInArray(String str) {

		Map<Character, Integer> map = new HashMap<>();
		char[] chars = str.toCharArray();

		for (char character : chars)
			map.put(character, map.getOrDefault(character, 0) + 1);

		for (int i = 0; i < chars.length; i++)
			if (isUnique(chars[i], map))
				return i;
		return -1;

	}

	private static boolean isUnique(char chars, Map<Character, Integer> map) {
		return map.get(chars) == 1;
	}
}
