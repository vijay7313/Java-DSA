package JVM;

public class MetaSpaceStaticFields {

	public static int global = 3;

	public int rollNo = 25;

	public static void main(String[] args) {

		System.out.println(global);

		MetaSpaceStaticFields m1 = new MetaSpaceStaticFields();

		System.out.println(m1.rollNo);

		MetaSpaceStaticFields m2 = new MetaSpaceStaticFields();

		System.out.println(m2.rollNo);
	}
}
