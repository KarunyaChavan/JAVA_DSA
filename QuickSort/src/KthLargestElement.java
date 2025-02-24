//Using "Quick Select" Algorithm -> T.C = O(n) -> Best among available approaches
//Leetcode 215
public class KthLargestElement {
	static int ans;
	public static void print(int[] arr){
		for(int ele : arr)
			System.out.print(ele + " ");
	}
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static int partition(int[] arr, int low, int high){
		int pivot = arr[low];
		int smaller_count = 0;
		for(int i=low+1;i<=high;i++){
			if(arr[i]<=pivot) smaller_count++;
		}
		int correct_index = low + smaller_count;
		swap(arr,low,correct_index);
		//parting
		int i = low, j = high;
		while(i < correct_index && j > correct_index){
			if(arr[i] <= pivot) i++;
			else if(arr[j] > pivot) j--;
			else if(arr[i] > pivot && arr[j]<=pivot) swap(arr,i,j);
		}
		return correct_index;
	}
	//Time Complexity : O(nlogn) in Avg Case & O(n^2) in the Worst Case | Space Complexity : Without considering Recursion Stack - O(1)
	public static void quickSelect(int[] arr, int low, int high, int k){
		if(low > high) return;
		if(low == high){
			if(low==k-1) ans = arr[low];
			return;
		}
		int idx = partition(arr,low,high);
		if(idx==k-1){
			ans = arr[idx];
			return;
		}
		if(k-1 < idx) quickSelect(arr, low,idx-1, k);
		else quickSelect(arr,idx+1, high, k);
	}
	public static void main(String[] args) {
		int[] arr = {4,9,1,2,6,5,8};
		int n = arr.length;
		System.out.print("\nArray : ");
		print(arr);
		int k = 2; //Means intended to select 4th largest element
		ans = -1;
		quickSelect(arr,0,n-1, (n-k+1)); //Kth Largest = (n-k+1)th Smallest Element
		System.out.println("\nKth Largest Element : " + ans);
	}
}
