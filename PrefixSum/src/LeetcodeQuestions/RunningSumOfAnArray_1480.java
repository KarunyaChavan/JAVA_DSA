//LEETCODE 1480
package LeetcodeQuestions;

public class RunningSumOfAnArray_1480 {
	public int[] runningSum(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] += nums[i - 1];
		}
		return nums;
	}
}