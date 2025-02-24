//Leetcode 41
public class FirstMissingPositiveNumber {
	public static void swap(int i, int j, int[] arr){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static int firstMissingPositive(int[] arr) {
		int n = arr.length, i = 0, ele;
		while(i<n){
			ele = arr[i];
			if(ele<=0 || ele==i+1 || ele>n || ele==arr[ele-1]) i++;
			else swap(i,ele-1,arr);
		}
		for(i=0;i<n;i++){
			if(arr[i]!=i+1) return i+1;
		}
		return i+1;
	}
	public static void main(String[] args) {
		int[] arr = {3,4,-1,1};
		System.out.print("First Missing Positive : "+firstMissingPositive(arr));
	}
}
