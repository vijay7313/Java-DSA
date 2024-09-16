package Java8;

@FunctionalInterface
interface Cals {
	int calOperator(int a, int b);
}

public class Calculator {

	public static void main(String[] args) {

		Cals add = (a, b) -> a + b;

		Cals sub = (a, b) -> a - b;

		Cals mul = (a, b) -> a * b;

		Cals div = (a, b) -> a / b;

		System.out.println(add.calOperator(2, 5));

		System.out.println(sub.calOperator(5, 2));

		System.out.println(mul.calOperator(2, 5));

		System.out.println(div.calOperator(5, 2));

	}
}
