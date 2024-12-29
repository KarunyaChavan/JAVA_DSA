public class SelectionSort {
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {3,1,2,5,4};
		for(int i=0;i<(arr.length - 1);i++){
			int min = Integer.MAX_VALUE;
			int minidx = -1;
			for(int j=i;j<arr.length;j++){
				if(arr[j]<min){
					min = arr[j];
					minidx = j;
				}
			}
			if(minidx!=-1){
				swap(arr,i,minidx);
			}
		}
		for(int ele:arr){
			System.out.print(ele + ", ");
		}
	}
}
