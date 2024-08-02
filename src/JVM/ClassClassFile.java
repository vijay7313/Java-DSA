package JVM;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassClassFile {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c = Class.forName("JVM.Student");

		Method[] methods = c.getDeclaredMethods();

		for (Method m1 : methods)
			System.out.println(m1);

		Constructor[] constructors = c.getDeclaredConstructors();

		for (Constructor m1 : constructors)
			System.out.println(m1);

		Field[] fields = c.getDeclaredFields();

		for (Field f1 : fields)
			System.out.println(f1);
	}
}
