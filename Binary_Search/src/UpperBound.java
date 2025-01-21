import static java.lang.Math.min;

//Upper Bound of x is the minimum index such that arr[index] > x.(Differnce is that upper bound is strictly greater)
public class UpperBound {
	public static void main(String[] args) {
		int[] arr = {10,23,46,46,91,97,97,140,264};
		int x = 30;
		int upper_bound = arr.length;
		int low = 0, high = upper_bound - 1, mid = 0;
		while(low <= high){
			mid = low + (high - low)/2;
			if(arr[mid]>x){
				upper_bound = min(upper_bound,mid);
				high = mid - 1;
			}
			else low = mid + 1;
		}
		System.out.println("Upper Bound of "+x+" = "+upper_bound);
	}
}
