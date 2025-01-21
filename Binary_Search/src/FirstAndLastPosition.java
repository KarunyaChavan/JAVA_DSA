public class FirstAndLastPosition {	//Leetcode 34
		public int[] searchRange(int[] arr, int target) {
			int[] ans = {-1,-1};
			int n = arr.length;
			boolean flag = false;
			int low = 0, high = n - 1, mid = 0;
			while(low<=high){
				mid = low + (high - low)/2;
				if(arr[mid]==target){
					flag = true;
					break;
				}
				else if(arr[mid]>target) high = mid - 1;
				else low = mid + 1;
			}
			if(!flag) return ans;

			int lower_bound = n;
			low = 0; high = n - 1; mid = 0;
			while(low<=high){
				mid = low + (high - low)/2;
				if(arr[mid]>=target){
					lower_bound = Math.min(lower_bound,mid);
					high = mid - 1;
				}
				else low = mid + 1;
			}
			ans[0] = lower_bound;

			int upper_bound = n;
			low = 0; high = n - 1; mid = 0;
			while(low<=high){
				mid = low + (high - low)/2;
				if(arr[mid]>target){
					upper_bound = Math.min(upper_bound,mid);
					high = mid - 1;
				}
				else low = mid + 1;
			}
			ans[1] = upper_bound - 1;
			return ans;
		}
	public static void main(String[] args) {

	}
}
