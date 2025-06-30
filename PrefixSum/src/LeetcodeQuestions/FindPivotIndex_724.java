//LEETCODE 724
package LeetcodeQuestions;

//TC - O(n)/
public class FindPivotIndex_724 {
	public int pivotIndex(int[] nums) {
		for(int i=1;i<nums.length;i++)
			nums[i] += nums[i-1];
		for(int i=0;i<nums.length;i++){
			int left_sum = 0;
			if(i>0) left_sum = nums[i-1];
			int right_sum = nums[nums.length - 1] - nums[i];
			if(left_sum==right_sum) return i;
		}
		return -1;
	}
}
