import java.util.Arrays;
public class MajorityELement {
	public static void main(String[] args) {
		int[] nums = {2,1,2,1,2,2};
		Arrays.sort(nums);
		System.out.println(nums[nums.length/2]);
	}
}
