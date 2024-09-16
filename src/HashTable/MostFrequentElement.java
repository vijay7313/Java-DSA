package HashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostFrequentElement {

	public static void main(String[] args) {
		int[] array = { 3, 1, 2, 2, 3, 4, 4, 2 };

		var result = mostFrequent(array);

		System.out.println(result);

	}

	public static int mostFrequent(int[] array) {

		Map<Integer, Integer> map = new HashMap<>();

		for (var arr : array)
			
			if (map.containsKey(arr))
				map.put(arr, map.get(arr) + 1);
			else
				map.put(arr, 1);
		

		int max = 0, res = 0;

		for (Entry<Integer, Integer> entry : map.entrySet())

			if (max < entry.getValue()) {
				max = entry.getValue();
				res = entry.getKey();
			}

		System.out.println(map);

		return res;

	}
}
