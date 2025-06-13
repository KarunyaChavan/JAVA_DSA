import java.util.Stack;

public class PrefixEvaluation {
	public static void main(String[] args) {
		String expr = "- 8 / * 5 3 7 6";
		System.out.println("Prefix Expression: " + expr);

		String[] tokens = expr.trim().split("\\s+");
		Stack<Integer> stack = new Stack<>();

		for (int i = tokens.length - 1; i >= 0; i--) {
			String token = tokens[i];

			if (isOperator(token)) {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(applyOperator(token.charAt(0), a, b));
			} else {
				stack.push(Integer.parseInt(token));
			}
		}

		System.out.println("Result: " + stack.pop());
	}

	private static boolean isOperator(String token) {
		return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
	}

	private static int applyOperator(char op, int a, int b) {
		switch (op) {
			case '+': return a + b;
			case '-': return a - b;
			case '*': return a * b;
			case '/': return a / b;
		}
		throw new IllegalArgumentException("Unknown operator: " + op);
	}
}
