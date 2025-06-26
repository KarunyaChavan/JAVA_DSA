package LeetcodeQuestions;
import java.util.*;

public class PathSum2_113 {
	public List<Integer> copy(List<Integer> arr){
		List<Integer> list = new ArrayList<>();
		for(int ele:arr){
			list.add(ele);
		}
		return list;
	}
	public void helper(TreeNode root, int target, List<Integer> arr, List<List<Integer>> ans){
		if(root==null) return;
		if(root.left==null && root.right==null){
			if(root.val==target){
				arr.add(root.val);
				ans.add(arr);
			}
			return;
		}
		arr.add(root.val);
		List<Integer> arr1 = copy(arr); //deep copy
		List<Integer> arr2 = copy(arr); //did this because passing by reference will override the arr
		helper(root.left, target-root.val,arr1,ans);
		helper(root.right, target-root.val,arr2,ans);
	}
	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		List<List<Integer>> ans = new ArrayList<>();
		helper(root, targetSum, new ArrayList<Integer>(),ans);
		return ans;
	}
}
