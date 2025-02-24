public class QuickSort {
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
	public static void quickSort(int[] arr, int low, int high){
		if(low>=high) return;
		// Place pivot (arr[low]) at appropriate index
		// left part <= pivot
		int idx = partition(arr,low,high);
		quickSort(arr,low,idx-1);
		quickSort(arr,idx+1,high);
	}
	public static void main(String[] args) {
		int[] arr = {4,9,7,1,2,3,6,5,8};
		int n = arr.length;
		print(arr);
		quickSort(arr,0,n-1);
		System.out.print("\nArray after sorting : ");
		print(arr);
	}
}