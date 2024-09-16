package JVM;

//Static Fields are likely most of the scenario used as memory optimization

//for a every class, static fields are create only one time

//for every instance, global fields are created separately 

//every instance are shared the same static fields of the class

public class StaticFieldsAndStaticMethods {
	public int a = 20;

	public static int b = 10;

	public static void main(String[] args) {

		StaticFieldsAndStaticMethods obj = new StaticFieldsAndStaticMethods();

		StaticFieldsAndStaticMethods.staticMethod(obj); // call static method using 
		                                        // class name itself

		StaticFieldsAndStaticMethods obj1 = new StaticFieldsAndStaticMethods();

		obj1.nonStatic();  //call nonStatic method using creation of Obj

	}

	public static void staticMethod(StaticFieldsAndStaticMethods obj) {
		
		System.out.println(b++);  // modifying the static field affect globally
		                          // and reflect on all instance
		System.out.println("in" + b);

//		System.out.println(a);  we can't directly use instance field on static method
		
		
		System.out.println(obj.a); // instead we can use instance field
		                           // using creation of object
	}

	public void nonStatic() {

		// we can use static field on non-static method

		System.out.println(b); // static field

	}
}
