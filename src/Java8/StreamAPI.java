package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {


	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(4, 5, 2, 1, 3, 6);

		List<Integer> lists = list.stream()
									.filter(n -> {
										System.out.println(n);
										return n % 2 == 1;
									})
									.map(n -> {
										System.out.println(n * 10);
										return n * 10;
									})
									.sorted()
									.collect(Collectors.toList());
		
		Stream<Integer> stream = list.stream()
				.filter(n -> {
					System.out.println(n);
					return n % 2 == 1;
				})
				.map(n -> {
					System.out.println(n * 10);
					return n * 10;
				})
				.sorted();
		
		stream.forEach(System.out::print);

		int total = list.stream()
				.filter(n -> n % 2 == 1)
				.map(n -> n * 10)
				.reduce(0, (c, e) -> c + e);



		System.out.println(total);

		System.out.println(lists);

	

	}

}

