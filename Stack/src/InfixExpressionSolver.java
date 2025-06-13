import java.util.Stack;

public class InfixExpressionSolver {
	public static void main(String[] args) {
		String str = "9-(5+3)*4/6";
		System.out.println("Infix Expression : " + str);
		Stack<Integer> val = new Stack<>();
		Stack<Character> op = new Stack<>();

		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			int ascii = (int)ch;
			if(ascii >= 48 && ascii <= 57)
				val.push(ascii - 48);
			else if(op.isEmpty() || ch == '(' || op.peek() == '(')
					op.push(ch);
			else if(ch==')'){
				while(op.peek()!='('){
					int b = val.pop();
					int a = val.pop();
					if(op.peek() == '-')
						val.push(a - b);
					if(op.peek() == '+')
						val.push(a + b);
					if(op.peek() == '*')
						val.push(a * b);
					if(op.peek() == '/')
						val.push(a/b);
					op.pop();
				}
				op.pop();
			}
			else{
				if(ch=='+' || ch=='-'){
					int b = val.pop();
					int a = val.pop();
					if(op.peek() == '-')
						val.push(a - b);
					if(op.peek() == '+')
						val.push(a + b);
					if(op.peek() == '*')
						val.push(a * b);
					if(op.peek() == '/')
						val.push(a/b);
					op.pop();
					op.push(ch);
				}
				else if(ch=='*' || ch=='/'){
					if(op.peek()=='*' || op.peek() == '/') {
						int b = val.pop();
						int a = val.pop();
						if (op.peek() == '*')
							val.push(a * b);
						if (op.peek() == '/')
							val.push(a / b);
						op.pop();
					}
					op.push(ch);
				}
			}
		}
		while(val.size() > 1){
			int b = val.pop();
			int a = val.pop();
			if(op.peek() == '-')
				val.push(a - b);
			if(op.peek() == '+')
				val.push(a + b);
			if(op.peek() == '*')
				val.push(a * b);
			if(op.peek() == '/')
				val.push(a/b);
			op.pop();
		}
		System.out.println("Answer : " + val.peek());
	}
}
