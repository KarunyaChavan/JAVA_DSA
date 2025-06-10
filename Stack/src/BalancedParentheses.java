//LEETCODE 20
import java.util.Stack;

public class BalancedParentheses {
	public boolean isValid(String s) {
		Stack<Character> st = new Stack<>();
		for(char c: s.toCharArray()){
			if(c=='(') st.push(')');
			else if(c=='{') st.push('}');
			else if(c=='[') st.push(']');
			else if(st.isEmpty() || st.pop()!=c) return false;
		}
		if(st.isEmpty()) return true;
		return false;
	}
}
