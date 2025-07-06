//LEETCODE 658
package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Find_k_ClosestElements_658 {
	//USING MAX HEAP
	public class Pair implements Comparable<Pair>{
		int ele, diff;
		Pair(int ele, int diff){
			this.ele = ele;
			this.diff = diff;
		}
		public int compareTo(Pair p){
			if(this.diff==p.diff){
				return this.ele - p.ele;
			}
			return this.diff - p.diff;
		}
	}
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder()); //max-heap
		for(int ele:arr){
			pq.add(new Pair(ele, Math.abs(x-ele)));
			if(pq.size()>k) pq.remove();
		}
		List<Integer> ans = new ArrayList<>();
		while(pq.size()>0){
			Pair p = pq.remove();
			ans.add(p.ele);
		}
		Collections.sort(ans);
		return ans;
	}
}
