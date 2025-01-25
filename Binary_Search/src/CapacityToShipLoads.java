public class CapacityToShipLoads { //Leetcode 1011
		public boolean isPossible(int minC,int[] arr, int d){
			int load = 0, days = 1;
			for(int i=0;i<arr.length;i++){
				if(load + arr[i] <= minC) load += arr[i];
				else{
					load = arr[i];
					days++;
				}
			}
			if(days > d) return false;
			return true;
		}
		public int shipWithinDays(int[] arr, int d) {
			int high = 0, low = 0, mid = 0, mx = Integer.MIN_VALUE, sum = 0;
			for(int i=0;i<arr.length;i++){
				mx = Math.max(mx, arr[i]);
				sum += arr[i];
			}
			low = mx; high = sum;
			int min_capacity = sum;
			while(low<=high){ //O(n * log(sum - max))
				mid = low + (high - low)/2;
				if(isPossible(mid,arr,d)){
					min_capacity = mid;
					high = mid - 1;
				}
				else low = mid + 1;
			}
			return min_capacity;
		}
}
