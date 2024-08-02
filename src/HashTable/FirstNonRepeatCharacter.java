package HashTable;

public class FirstNonRepeatCharacter {

	public static void main(String[] args) {

		String characters = "a green apple";

		var chars = characters.length();

		for (int i = 0; i < chars; i++) {
			int flag = 0;

			if (characters.charAt(i) == ' ')
				continue;

			for (int j = i + 1; j < chars; j++)
				if (characters.charAt(i) == characters.charAt(j)) {
					flag++;
					break;
				}

			if (flag == 0) {
				System.out.println(characters.charAt(i));
				break;
			}

		}
	}
}
