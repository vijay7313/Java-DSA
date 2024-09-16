package JVM;

public class HeapMemory {

	public static void main(String[] args) {

		Runtime run = Runtime.getRuntime();

		System.out.println(run.maxMemory()); // max memory allocate to the heap

		System.out.println(run.totalMemory()); // total memory in the heap

		System.out.println(run.freeMemory()); // free memory remaining in the heap

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		classLoader.clearAssertionStatus();
//		classLoader.reload();
	}

}
