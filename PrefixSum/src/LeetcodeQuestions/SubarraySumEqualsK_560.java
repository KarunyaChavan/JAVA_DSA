//LEETCODE 560
package LeetcodeQuestions;
import java.util.HashMap;

public class SubarraySumEqualsK_560 {
	//BRUTE FORCE - TC = (n*n)
	public int subarraySum(int[] nums, int k) {
		int count = 0;
		int n = nums.length;
		for(int i=0;i<n;i++){
			int sum = 0;
			for(int j=i;j<n;j++){
				sum += nums[j];
				if(sum==k) count++;
			}
		}
		return count;
	}

	//USING PREFIX SUM LOGIC WITH HASHMAP - TC = O(n)
	public int subarraySum2(int[] nums, int k) {
		int count = 0, n = nums.length;
		for(int i=1;i<n;i++){
			nums[i] += nums[i-1];
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<n;i++){
			if(nums[i]==k) count++;
			int rem = nums[i] - k;
			if(map.containsKey(rem)) count += map.get(rem);
			if(map.containsKey(nums[i])){
				map.put(nums[i], map.get(nums[i])+1); //freq increased
			}
			else map.put(nums[i], 1);
		}
		return count;
	}
}
