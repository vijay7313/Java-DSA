package Stack;

public class MainExpressionCheck {

	public static void main(String[] args) {

		String string = "{()}";

		BalancedExpression expression = new BalancedExpression();

		boolean check = expression.isBalanced(string);

		System.out.println(check);
	}
}
