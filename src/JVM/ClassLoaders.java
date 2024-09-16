package JVM;

//run with java 8 or below version for better output
public class ClassLoaders {

	public static void main(String[] args) {

		System.out.println(String.class.getClassLoader());
		
		System.out.println(Student.class.getClassLoader()); 
		// need to convert class file to jar file and paste it to extension path
		
		System.out.println(ClassLoaders.class.getClassLoader());

	}
}
