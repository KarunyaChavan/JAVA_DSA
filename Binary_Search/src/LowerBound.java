import static java.lang.Math.min;

//(Given a sorted array)lower bound of an element is smallest idx such that arr[idx] >= x. If x lies in the array then its lower bound is its index itself. If last element is greater than x, then lower bound is len(arr)
public class LowerBound {
	public static void main(String[] args) {
		int[] arr = {10,23,46,46,91,97,97,140,264};
		int x = 50;
		int lower_bound = arr.length;
		int low = 0, high = lower_bound - 1, mid = 0;
		while(low<=high){
			mid = low + (high - low)/2;
			if(arr[mid]>=x){
				lower_bound = min(lower_bound,mid);
				high = mid - 1;
			}
			else low = mid + 1;
		}
		System.out.println("Lower Bound of "+x+" = "+lower_bound);
	}
}
