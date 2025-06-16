//GFG First negative in every window of size k
import java.util.*;

public class FirstNegativeInWindowOfSize_k {
	static List<Integer> firstNegInt(int arr[], int k) {
		int n = arr.length;
		Queue<Integer> q = new LinkedList<>();
		List<Integer> res = new ArrayList<>();

		// Initialize the queue with negative numbers' indices
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				q.add(i);
			}
		}

		// Slide through the array and check for the first negative integer in each window of size k
		for (int i = 0; i <= n - k; i++) {
			// Remove elements out of this window (i.e., indices < i)
			while (!q.isEmpty() && q.peek() < i) {
				q.poll();
			}

			// Add the result for this window
			if (!q.isEmpty()) {
				res.add(arr[q.peek()]); // The first negative integer in the window
			} else {
				res.add(0); // If no negative integer is found, add 0
			}

			// Now add the next element to the window
			if (i + k < n && arr[i + k] < 0) {
				q.add(i + k);
			}
		}

		return res;
	}
}
