package LeetcodeQuestions;
import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum_2389 {
	public int[] answerQueries(int[] nums, int[] queries) {
		Arrays.sort(nums);
		int n = nums.length, m = queries.length;
		for(int i=1;i<n;i++)
			nums[i] += nums[i-1];
		int[] ans = new int[m];
		for(int i=0;i<m;i++){
			int low = 0, high = n-1;
			while(low<=high){
				int mid = low + (high - low)/2;
				if(nums[mid] > queries[i]) high = mid - 1;
				else{
					ans[i] = Math.max(ans[i], mid + 1);
					low = mid+1;
				}
			}
		}
		return ans;
	}
}
