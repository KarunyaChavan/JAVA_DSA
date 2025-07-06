//LEETCODE 973
package LeetcodeQuestions;

import java.util.Collections;
import java.util.PriorityQueue;

public class K_ClosestPointsToOrigin_973 {
	public class Triplet implements Comparable<Triplet>{
		int x, y, d;
		Triplet(int x, int y, int d){
			this.x = x;
			this.y = y;
			this.d = d;
		}
		public int compareTo(Triplet t){
			return this.d - t.d;
		}
	}
	public int[][] kClosest(int[][] points, int k) {
		PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder()); //Maxheap
		for(int i=0;i<points.length;i++){
			int x = points[i][0];
			int y = points[i][1];
			int d2 = x*x + y*y;
			pq.add(new Triplet(x,y,d2));
			if(pq.size()>k) pq.remove();
		}
		int[][] ans = new int[k][2];
		for(int i=0;i<k;i++){
			Triplet pt = pq.remove();
			ans[i][0] = pt.x; ans[i][1] = pt.y;
		}
		return ans;

	}
}
