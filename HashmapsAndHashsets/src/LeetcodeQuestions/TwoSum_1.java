package LeetcodeQuestions;
import java.util.HashMap;

public class TwoSum_1 {
	//USING HASHMAPS - TC = O(n) but SC = O(n)
	public int[] twoSum(int[] nums, int target) {
		int[] ans = {-1,-1};
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			int rem = target - nums[i]; //we'll check for the remaining value and if found then we return

			if(map.containsKey(rem)){
				ans[0] = i;
				ans[1] = map.get(rem);
				return ans;
			}
			else map.put(nums[i], i);
		}
		return ans;
	}
}
