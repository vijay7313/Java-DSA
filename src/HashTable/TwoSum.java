package HashTable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] array = { 2, 7, 11, 5 };

		var result = indexOfTwoSum(array, 9);

		System.out.println("[" + result[0] + ", " + result[1] + "]");
	}

	private static int[] indexOfTwoSum(int[] array, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < array.length; i++) {

			int compliment = target - array[i];

			if (map.containsKey(compliment))
				return new int[] { map.get(compliment), i };

			map.put(array[i], i);
		}

		return null;

	}
}
