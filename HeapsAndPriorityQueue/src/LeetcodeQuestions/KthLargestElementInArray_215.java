//LEETCODE 215
package LeetcodeQuestions;
import java.util.PriorityQueue;

public class KthLargestElementInArray_215 {
	//USING MIN-HEAP
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int ele:nums){
			pq.add(ele);
			if(pq.size() > k) pq.remove();
		}
		return pq.peek();
	}
}
