//LEETCODE 1047
import java.util.Stack;

/*
Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.
The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
* */

public class RemovingConsecutiveDuplicates {
	public String removeDuplicates(String s) {
		Stack<Character> st = new Stack<>();
		for(char c: s.toCharArray()){
			if(!st.isEmpty() && st.peek() == c) st.pop();
			else st.push(c);
		}
		StringBuilder str = new StringBuilder();
		while(!st.isEmpty()){
			str.append(st.pop());
		}
		return str.reverse().toString();
	}
}
