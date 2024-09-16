package HashTable;

import java.util.HashSet;
import java.util.Set;

public class HashSetExercise {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5 };

		int[] array2 = { 3, 4, 5, 6 };

		Set<Integer> result = getIntersection(array1, array2);

		System.out.println(result);

	}

	public static Set<Integer> getIntersection(int[] array1, int[] array2) {

		Set<Integer> set = new HashSet<>();

		Set<Integer> intersectSet = new HashSet<>();

		for (int arr : array1)
			set.add(arr);

		for (int arr : array2)
			if (set.contains(arr))
				intersectSet.add(arr);

		return intersectSet;
	}
}
