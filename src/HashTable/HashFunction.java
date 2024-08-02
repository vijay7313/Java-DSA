package HashTable;

public class HashFunction {

	public static void main(String[] args) {
		var hash = hash("orange");

		System.out.println(hash);
	}

	public static int hash(String str) {
		int hash = 0;
		for (var ch : str.toCharArray()) {

			hash += ch;

		}
		return hash;
	}
}
