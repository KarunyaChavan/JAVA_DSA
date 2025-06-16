//GFG Interleave the First Half of the Queue with Second Half
import java.util.*;

class InterleaveFirstHalfWithSecondHalf {
	public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
		int n = q.size();
		int half = n / 2;

		Queue<Integer> firstHalf = new LinkedList<>();

		// Step 1: Put the first half into a new queue
		for (int i = 0; i < half; i++) {
			firstHalf.add(q.remove());
		}

		// Step 2: Interleave firstHalf and secondHalf
		Queue<Integer> result = new LinkedList<>();
		while (!firstHalf.isEmpty()) {
			result.add(firstHalf.remove());
			result.add(q.remove()); // from second half
		}

		return result;
	}
}
