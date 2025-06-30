//LEETCODE 303
package LeetcodeQuestions;

//TC for one query - O(n), so for 'm' queries - O(m*n).
//We can improve TC to O(m+n) by creating Prefix Sum.
public class RangeSumQueryImmutable_303 {
	static int[] arr;
	public RangeSumQueryImmutable_303(int[] nums) {
		this.arr = nums; //shallow copy
		for(int i=1;i<nums.length;i++)
			arr[i] += arr[i-1];
	}

	public int sumRange(int left, int right) {
		if(left==0) return arr[right];
		return arr[right] - arr[left-1];
	}
}
