import java.util.Stack;

public class PostfixToPrefix {
	public static void main(String[] args) {
		String str = "953+4*6/-";
		System.out.println("Postfix Expression : " + str);
		Stack<String> val = new Stack<>();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			int ascii = (int)ch;
			if(ascii >= 48 && ascii <= 57){
				val.push(ch + "");
			}
			else{
				String b = val.pop();
				String a = val.pop();
				char op = ch;
				String t = op + a + b;
				val.push(t);
			}
		}
		System.out.println("Prefix Expression : " + val.peek());
	}
}
