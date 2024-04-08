package Stack;

public class MainStringReverse {

	public static void main(String[] args) {
		String str = "abcdefghij";

		System.out.println(str);

		StringReverse stringReverse = new StringReverse();

		String result = stringReverse.reverse(str);

		System.out.println(result);
	}
}
