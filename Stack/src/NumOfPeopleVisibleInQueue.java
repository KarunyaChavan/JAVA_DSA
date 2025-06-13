//LEETCODE 1944
import java.util.Stack;

public class NumOfPeopleVisibleInQueue {
	public int[] canSeePersonsCount(int[] heights) {
		int n = heights.length;
		int[] ans = new int[n];
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<n;i++){
			while(!st.isEmpty() && heights[st.peek()] <= heights[i]){
				ans[st.peek()]++;
				st.pop();
			}
			if(!st.isEmpty()){
				ans[st.peek()]++;
			}
			st.push(i);
		}
		return ans;
	}
}
