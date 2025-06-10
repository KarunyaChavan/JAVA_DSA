//LEETCODE 84
import java.util.Stack;

public class LargestRectangleInHistogram {
	//Area = height * (NSE - PSE + 1)
	//; NSE - No. of elements greater than current at it's right
	public int largestRectangleArea(int[] heights) {
		int n = heights.length;
		Stack<Integer> st = new Stack<>();
		int[] left_small = new int[n];
		int[] right_small = new int[n];
		for(int i=0;i<n;i++){
			while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
			left_small[i] = st.isEmpty()? 0:(st.peek()+1);
			st.push(i);
		}
		while(!st.isEmpty()) st.pop();
		for(int i=n-1;i>=0;i--){
			while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
			right_small[i] = st.isEmpty()? n-1:(st.peek()-1);
			st.push(i);
		}
		int max_area = 0;
		for(int i=0;i<n;i++){
			max_area = Math.max(max_area, heights[i] * (right_small[i] - left_small[i] + 1));
		}
		return max_area;
	}
}
