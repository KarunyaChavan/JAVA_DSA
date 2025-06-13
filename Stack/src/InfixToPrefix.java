import java.util.Stack;

public class InfixToPrefix {
	public static void main(String[] args) {
		String str = "8-(5+3)*(4/6)";
		System.out.println("Infix Expression : " + str);
		Stack<String> val = new Stack<>();
		Stack<Character> op = new Stack<>();
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			int ascii = (int)ch;
			if(ascii >= 48 && ascii <=57){
				String s = "" + ch;
				val.push(s);
			}
			else if(op.isEmpty() || ch == '(' || op.peek() == '(')
				op.push(ch);
			else if(ch == ')'){
				while(op.peek()!='('){
					String b = val.pop();
					String a = val.pop();
					char o = op.pop();
					String t = o + a + b;
					val.push(t);
				}
				op.pop();
			}
			else{
				if(ch == '+' || ch == '-'){
					String b = val.pop();
					String a = val.pop();
					char o = op.pop();
					String t = o + a + b;
					val.push(t);
					op.push(ch);
				}
				else if(ch == '*' || ch == '/'){
					if(op.peek() == '*' || op.peek() == '/'){
						String b = val.pop();
						String a = val.pop();
						char o = op.pop();
						String t = o + a + b;
						val.push(t);
						op.push(ch);
					}
					else op.push(ch);
				}
			}
		}
		while(val.size() > 1){
			String b = val.pop();
			String a = val.pop();
			char o = op.pop();
			String t = o + a + b;
			val.push(t);
		}
		System.out.println("Prefix Expression : " + val.peek());
	}
}