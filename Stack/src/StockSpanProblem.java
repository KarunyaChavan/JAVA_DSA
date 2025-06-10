//GFG - Stock Span Problem
import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {
	public static ArrayList<Integer> calculateSpan(int[] arr) {
		// write code here
		int n = arr.length;
		ArrayList<Integer> ans = new ArrayList<>();
		Stack<Integer> st = new Stack<>();
		st.push(0);
		for(int i=0;i<n;i++){
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]) st.pop();
			ans.add(i, (st.isEmpty()? (i+1) : (i-st.peek())));
			st.push(i); //indices are being used as day number
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] prices = {10, 4, 5, 90, 120, 80, 200};
		ArrayList<Integer> output = calculateSpan(prices);
		System.out.println(output);
	}
}
