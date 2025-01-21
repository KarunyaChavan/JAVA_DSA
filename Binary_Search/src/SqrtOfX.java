//For any number x , 0<=sqrt(x) <= x.
public class SqrtOfX { //Leetcode 69
	public static void main(String[] args) {
		int x = 16;
		int low = 0, high = x - 1, mid = 0;
		while(low<=high){
			mid = low + (high - low)/2;
			if(mid*mid == x) {
				System.out.println(mid);
				break;
			}
			else if(mid*mid > x) high = mid - 1;
			else low = mid + 1;
		}
	}
}
