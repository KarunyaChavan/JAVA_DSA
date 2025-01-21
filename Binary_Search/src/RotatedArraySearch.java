public class RotatedArraySearch { //Leetcode 33
	public static int search(int[] arr, int target) {
		int n = arr.length;
		int low = 0, high = n - 1, mid = 0;
		while(low<=high){
			mid = low + (high - low)/2;
			if(arr[mid]==target) return mid;
			else if(arr[mid]<=arr[high]){ //In right sorted part
				if(target>arr[mid] && target<=arr[high]) low = mid + 1;
				else high = mid - 1;
			}
			else{ //In left sorted array
				if(target < arr[mid] && target >=arr[low]) high = mid - 1;
				else low = mid + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {3,4,5,6,7,0,1,2};
		int idx = search(arr,0);
		System.out.println(idx);
	}
}
