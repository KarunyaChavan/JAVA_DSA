import java.util.Arrays;
//Leetcode 268
public class MissingNumber {
	public static int missingNumber(int[] nums) {
		int n = nums.length;
		int sum_of_elements = Arrays.stream(nums).sum();
		int sum_of_numbers = n * (n+1) / 2;
		return sum_of_numbers - sum_of_elements;
	}
	public static void main(String[] args) {
		int[] arr = {3,0,1};
		System.out.println(missingNumber(arr));
	}
}
