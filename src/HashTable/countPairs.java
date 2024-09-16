package HashTable;

import java.util.HashSet;
import java.util.Set;

public class countPairs {

	public static void main(String[] args) {

		int[] array = { 1, 7, 5, 9, 2, 12, 3 };

		var result = countPairsWithDiff(array, 2);

		System.out.println(result);

	}

	private static int countPairsWithDiff(int[] array, int k) {

		Set<Integer> seen = new HashSet<>();
		Set<String> pairs = new HashSet<>();

		for (int num : array) {
			if (seen.contains(num + k))
				pairs.add("(" + num + "," + (num + k) + ")");

			if (seen.contains(num - k))
				pairs.add("(" + num + "," + (num - k) + ")");

			seen.add(num);
		}

		return pairs.size();
	}

}
