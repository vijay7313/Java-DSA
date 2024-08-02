package HashTable;

public class FirstNonRepeatCharacterUsingHashMap {

	public static void main(String[] args) {
		FindChar find = new FindChar();

		var chars = find.findFirstNonRepeatingChar("a green apple");

		System.out.println(chars);
	}
}
