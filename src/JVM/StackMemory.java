package JVM;

public class StackMemory {

	public static void main(String[] args) {

		StackStudent student = new StackStudent();

		System.out.println(student.getTeacherName()); // Aravind

		student.setTeacherName("parimala");

		System.out.println(student.getTeacherName()); // parimala

		System.out.println(student.getStudentName()); // null

		studentMethod(student);

		System.out.println(student.getStudentName()); // vijayaraja

		System.out.println(student.getTeacherName()); // mallu

		String value = "vijay";

		stringMethod(value);

		System.out.println(value); // vijay

	}

	private static void stringMethod(String value) {

		String value1 = value + "raja";

		value = value + "java";

		System.out.println(value); // vijayjava

	}

	private static void studentMethod(StackStudent student2) {

		student2.setStudentName("vijay");

		StackStudent student3 = new StackStudent();

		student3 = student2;

		student3.setTeacherName("mallu");

		student3.setStudentName("vijayaraja");

	}

}
