//LEETCODE 503
import java.util.Stack;

public class NextGreaterElement {
	public int[] nextGreaterElements(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		Stack<Integer> st = new Stack<>();

		// Initialize result with -1
		for (int i = 0; i < n; i++) {
			ans[i] = -1;
		}

		// Traverse the array twice
		for (int i = 2 * n - 1; i >= 0; i--) {
			int num = nums[i % n];

			// Maintain decreasing stack
			while (!st.isEmpty() && st.peek() <= num) {
				st.pop();
			}

			// Only assign during the first pass
			if (i < n) {
				ans[i] = st.isEmpty() ? -1 : st.peek();
			}

			st.push(num);
		}

		return ans;
	}
}
