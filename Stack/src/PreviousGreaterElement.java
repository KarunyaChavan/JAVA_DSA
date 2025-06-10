import java.util.Scanner;
import java.util.Stack;

public class PreviousGreaterElement {
	public static int[] prevGreaterElement(int[] arr, int n){
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[n];
		ans[0] = -1;
		st.push(arr[0]);
		System.out.println("-1");
		for(int i=1;i<n;i++){
			while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();
			ans[i] = st.isEmpty()? -1:st.peek();
			st.push(arr[i]);
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {10,4,5,20,40,12,30};
		int n = arr.length;
		int[] output = prevGreaterElement(arr,n);
		for(int ele:output)
			System.out.print(ele + " ");
	}
}
