package JVM;

public class Student {

	private String name;

	private int rollNo;

	public Student(int rollNo, String name) {

		this.rollNo = rollNo;
		this.name = name;
	}

	public Student() {

	}

	public String getName() {
		return name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

}
