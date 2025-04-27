
public class BubbleSort {
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {3,1,2,5,4};
		int temp;
		System.out.print("Unsorted Array : ");
		print(arr);
		for(int i=0;i<(arr.length - 1);i++){
			boolean flag = false;
			for(int j=0;j<(arr.length - i - 1);j++) {
				if (arr[j] > arr[j + 1]) {
					flag = true;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if(!flag) break;
		}
		System.out.print("\nSorted Array : ");
		print(arr);
	}
}
