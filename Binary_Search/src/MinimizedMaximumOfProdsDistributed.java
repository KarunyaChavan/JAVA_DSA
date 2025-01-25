public class MinimizedMaximumOfProdsDistributed { //Leetcode 2064
	public int minimizedMaximum(int n, int[] quantities) {
		int max = 0;
		for(int q : quantities){
			max = Math.max(max, q);
		}
		int left = 1, right = max;
		while(left <= right){
			int mid = left + (right - left) / 2;
			if(isValid(n, quantities, mid)){
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

	private boolean isValid(int n, int[] q, int target) {
		int cnt = n - q.length;
		for (int i : q) {
			if (i <= target) continue;
			cnt -= (i - 1) / target;
			if (cnt < 0) return false;
		}
		return true;
	}
}
