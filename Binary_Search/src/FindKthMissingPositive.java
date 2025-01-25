public class FindKthMissingPositive { //Leetcode 1539
	public static int findKthPositive(int[] arr, int k) {
		int low = 0, high = arr.length - 1, mid = 0, missed = 0;
		while(low <= high){
			mid = low + (high - low)/2;
			missed = arr[mid] - (mid + 1);
			if(missed < k) low = mid + 1;
			else high = mid - 1;
		}
		return k + low;
	}

	public static void main(String[] args) {
		int[] arr = {2,3,4,7,11};
		int k = 5;
		int missed_num = findKthPositive(arr,k);
		System.out.println(missed_num);
	}
}
