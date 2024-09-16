package Java8;

class Message {

	public void print() {
		System.out.println("Hello");
	}
}

public class AnonymousClass {

	public static void main(String[] strings) {

		Message obj = new Message() {

			public void print() {
				System.out.println("Welcome");
			}
		};

		obj.print();

	}

}
