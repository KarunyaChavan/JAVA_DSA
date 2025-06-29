//LEETCODE 1814
package LeetcodeQuestions;
import java.util.HashMap;

public class CountNicePairsInArray_1814 {
	//given condition is modified as,
	//nums[i] - rev(nums[i]) == nums[j] - rev(nums[j]), it unifies and decreases tc
	public int reverse(int n){
		int r = 0;
		while(n!=0){
			r = r*10 + n%10;
			n /= 10;
		}
		return r;
	}
	public int countNicePairs(int[] nums) {
		int count = 0, n = nums.length;
		HashMap<Integer, Integer> map = new HashMap<>();//<nums[i] - rev(nums[i]), freq>
		for(int i=0;i<n;i++){
			int ele = nums[i] - reverse(nums[i]);
			if(map.containsKey(ele)){
				count += map.get(ele); //imp
				count %= 1000000007; //given constraint
				map.put(ele, map.get(ele)+1);
			}
			else map.put(ele, 1);
		}
		return count;
	}
}
