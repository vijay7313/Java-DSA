package JVM;

public class HeapAreaObjAndClassclassObj {

	public static void main(String... args) {

		int d = 10;

		String s = new String("vijay");

		Student s1 = new Student();

		Class c1 = s1.getClass();

		Student s2 = new Student();

		Class c2 = s2.getClass();

		System.out.println(s1.hashCode());

		System.out.println(s2.hashCode());

		System.out.println(c1.hashCode());

		System.out.println(c2.hashCode());

	}

}
