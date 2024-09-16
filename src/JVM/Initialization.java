package JVM;

import java.lang.System;

public class Initialization {

	public static String day = "Sunday";

	public static void main(String[] args) {

		System.out.println("Starting main...");
		System.out.println("Accessing Child.staticField: " + Child.staticField);
		Child.staticMethod();
		System.out.println("Calculator execution complete.");
	}
}

class Parent {

	public static int staticField = 100;

	static {
		System.out.println("Parent class is being initialized.");
	}

	public static void staticMethod() {
		System.out.println("Inside Parent's staticMethod");
	}

}

class Child extends Parent {

	public static int staticField = 200;

	static {
		System.out.println("Child class is being initialized.");
	}

	public static void staticMethod() {
		System.out.println("Inside child's staticMethod");
	}
}
