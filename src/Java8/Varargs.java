package Java8;

@FunctionalInterface
interface MessagePrinter {
	void printMessages(String... messages);
}

public class Varargs {

	public static void main(String[] args) {

		MessagePrinter varargsPrinter = messages -> {

			for (String message : messages)
				System.out.println(message);

		};

//		varargsPrinter.printMessages("Hi", "Hello", "Welcome");
	}
}
