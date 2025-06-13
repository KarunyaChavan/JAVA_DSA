//LEETCODE 946
import java.util.Stack;

public class ValidateStackSequences {
	public boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> st = new Stack<>();
		int ptr = 0; //used for popped arr

		for(int val:pushed){
			st.push(val);
			while(!st.isEmpty() && st.peek() == popped[ptr]){
				st.pop();
				ptr++;
			}
		}
		return st.isEmpty();
	}
}
//TC = O(N) and SC = O(N)
