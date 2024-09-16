package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPINotes {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 2, 1, 6, 4, 2, 5, 4, 7);

		List<Integer> uList = list.stream()
				.distinct()
				.filter(n -> n % 2 == 0)
				.sorted()
				.map(n -> n * 2)
				.collect(Collectors.toList());

		for(int value:uList)
		System.out.println(value);

		Stream<Integer> data = list.stream(); // Stream creation of list

		Stream<Integer> distinct = data.distinct(); // Remove duplicates

		Stream<Integer> filter = distinct.filter(n -> n % 2 == 0); // Filter even numbers

		Stream<Integer> sorted = filter.sorted(); // Sort the filtered stream in natural order

		Stream<Integer> map = sorted.map(n -> n * 2); // Multiply each element by 2

		map.forEach(System.out::println); // Print each element in the stream

	}
}
