//Leetcode 287
public class FindDuplicated {
	public static void swap(int i, int j, int[] arr){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static int findDuplicate(int[] arr) {
		while(true){
			int ele = arr[0];
			if(arr[ele] == ele) return ele;
			swap(0, ele, arr);
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,3,4,2,2};
		System.out.println(findDuplicate(arr));
	}
}
