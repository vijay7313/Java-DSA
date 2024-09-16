package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionAndConsumerExample {

	public static void main(String[] args) {

		Function<Integer, Integer> areaOfSquare = (n) -> n * n;

		System.out.println(areaOfSquare.apply(12));

		Function<Integer, String> funcString = (n) -> "The result is: " + n * 2;

		System.out.println(funcString.apply(22));

		List<Integer> list = new ArrayList<>();

		Consumer<List<Integer>> addNumbers = numbersList -> {

			for (int i = 1; i <= 5; i++)
				numbersList.add(i);
		};

		addNumbers.accept(list);

		System.out.println(list);

		Consumer<String> toUpperCase = str -> System.out.println(str.toUpperCase());

		toUpperCase.accept("vijay");
	}
}
