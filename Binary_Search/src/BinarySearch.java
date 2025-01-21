public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {3,5,19,75,98};
		int target = 75;
		int low = 0, high = arr.length - 1, mid = 0;
		while(low<=high){
			mid = low + (high - low)/2;
			if(arr[mid]==target){
				System.out.println("Found at index " + mid);
				break;
			}
			else if(arr[mid] < target) low = mid + 1;
			else high = mid - 1;
		}
	}
}