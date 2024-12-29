public class InsertionSort {
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {3,1,2,5,4};
		for(int i=1;i<(arr.length);i++){
			for(int j=i;j>=1;j--){
				if(arr[j]<arr[j-1])
					swap(arr,j,j-1);
				else break;
			}
		}
		for(int ele:arr){
			System.out.print(ele + ", ");
		}
	}
}
