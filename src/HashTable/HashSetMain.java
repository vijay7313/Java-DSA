package HashTable;



public class HashSetMain {

	public static void main(String[] args) {

		HashSetImpl set = new HashSetImpl();

		System.out.println(set.add(1));
		System.out.println(set.add(3));
		System.out.println(set.add(2));
		System.out.println(set.add(3));

		System.out.println(set.contains(3));
		System.out.println(set.contains(22));

		System.out.println(set.remove(33));
		System.out.println(set.remove(3));

	}
}
