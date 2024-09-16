package Java8;

interface Sayable {
	// no return for say()
	void say();
}

public class MethodReference {

	// return int here
	public static int saySomething() {
		System.out.println("Hello, this is static method.");
		return 0;
	}

	public static void main(String[] args) {

		// Referring static method
		Sayable sayable = MethodReference::saySomething;

		// Calling interface method
		sayable.say();
	}
}
//while creating method reference return type will be ignored by java. 
//only parameter will be must match 
