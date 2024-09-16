package Java8;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class PredicateAndBinaryOperatorExample {

	public static void main(String[] args) {

		Predicate<Integer> isEven = (n) -> n % 2 == 0;

		boolean result = isEven.test(21);

		System.out.println(result);

		Predicate<String> startsWith = (str) -> str.startsWith("Hi vijay");

		boolean resultstr = startsWith.test("Hi vijayaraja");

		System.out.println(resultstr);

		BinaryOperator<String> binary = (a, b) -> a.length() > b.length() ? a : b;

		System.out.println(binary.apply("naveen", "vijayaraja"));

		BinaryOperator<Integer> compare = (i, j) ->{
			return i > j ? i : j;
		};

		System.out.println(compare.apply(12, 11));

	}
}
