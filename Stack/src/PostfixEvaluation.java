import java.util.Stack;

public class PostfixEvaluation {
	public static void main(String[] args) {
		String str = "953+4*6/-";
		System.out.println("Postfix Expression: " + str);

		Stack<Integer> val = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				val.push(ch - '0');  // Better than manual ASCII conversion
			} else {
				int b = val.pop();
				int a = val.pop();
				switch (ch) {
					case '+': val.push(a + b); break;
					case '-': val.push(a - b); break;
					case '*': val.push(a * b); break;
					case '/': val.push(a / b); break;
					default: throw new IllegalArgumentException("Invalid operator: " + ch);
				}
			}
		}

		System.out.println("Result: " + val.pop());
	}
}
