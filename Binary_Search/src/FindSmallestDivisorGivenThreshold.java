public class FindSmallestDivisorGivenThreshold { //Leetcode 1283
	public static boolean isLess(int mid,int[] arr,int threshold){
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%mid==0) sum += arr[i]/mid;
			else sum += arr[i]/mid + 1;
		}
		if(sum <= threshold)
			return true;
		return false;
	}
	public static int smallestDivisor(int[] arr, int threshold) {
		int mx = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			mx = Math.max(mx,arr[i]);
		}
		int d = 1;
		int low = 1, high = mx, mid;
		while(low<=high){
			mid = low + (high - low)/2;
			if(isLess(mid,arr,threshold)){
				high = mid - 1;
				d = mid;
			}
			else low = mid + 1;
		}
		return d;
	}
	public static void main(String[] args) {
		int[] nums = {1,2,5,9};
		int threshold = 5;
		int res = smallestDivisor(nums,threshold);
		System.out.println(res);
	}
}
