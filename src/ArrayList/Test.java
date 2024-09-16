package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		ArrayList<String> stringlist = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));

		stringlist.remove("a");
		stringlist.remove(0);

		System.out.println(stringlist);

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

		list.remove(2);
		list.remove(Integer.valueOf(2));

		System.out.println(list);

	}
}
