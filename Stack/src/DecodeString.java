//LEETCODE 394
import java.util.Stack;

public class DecodeString {
	public String decodeString(String s) {
		Stack<Character> st = new Stack<>();
		for(char ch: s.toCharArray()){
			if(ch != ']') st.push(ch);
			else{
				//extracting the substring
				StringBuilder sb = new StringBuilder();
				while(st.peek()!='['){
					sb.append(st.pop());
				}
				//remove '['
				st.pop();
				//extracting number
				int k = 0, base = 1;
				while(!st.isEmpty() && Character.isDigit(st.peek())){
					k = (st.pop() - '0') * base + k;
					base *= 10;
				}
				while(k-- > 0){
					for(int i=sb.length() - 1; i>=0;i--){
						st.push(sb.charAt(i));
					}
				}
			}
		}
		char[] ans = new char[st.size()];
		for(int i=st.size()-1;i>=0;i--){
			ans[i] = st.pop();
		}
		return new String(ans);
	}
}
