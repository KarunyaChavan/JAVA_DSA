package LeetcodeQuestions;

public class ProductOfArrayExceptSelf_238 {
	public int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] pre = new int[n];
		int[] suff = new int[n];
		pre[0] = 1;
		for(int i=1;i<n;i++){
			pre[i] = nums[i-1] * pre[i-1];
		}
		suff[n-1] = 1;
		for(int i=n-2;i>=0;i--){
			suff[i] = nums[i+1] * suff[i+1];
		}
		for(int i=0;i<n;i++)
			pre[i] *= suff[i];
		return pre;
	}
}
