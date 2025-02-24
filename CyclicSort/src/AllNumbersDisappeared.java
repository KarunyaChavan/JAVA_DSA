import java.util.ArrayList;

public class AllNumbersDisappeared {
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
		int n = nums.length;
		int i = 0;
		while(i<n){
			int ele = nums[i]; //ele should be at ele - 1
			if(nums[i]==i+1 || nums[i]==nums[ele - 1]) i++;
			else{
				swap(nums,i,ele-1);
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for(i=0;i<n;i++){
			if(nums[i]!=i+1) ans.add(i+1);
		}
		return ans;

	}

	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(arr));
	}
}
