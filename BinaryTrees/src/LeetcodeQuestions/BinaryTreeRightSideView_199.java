//LEETCODE 199
package LeetcodeQuestions;
import java.util.*;

public class BinaryTreeRightSideView_199 {
	public int levels(TreeNode root){
		if(root==null) return 0;
		return 1 + Math.max(levels(root.left), levels(root.right));
	}
	public void preorderTraversal(TreeNode root, int level, List<Integer> ans){
		if(root==null) return;
		ans.set(level, root.val); //imp - relative order is maintained from left to right so overwritten by right eventually
		preorderTraversal(root.left, level+1,ans);
		preorderTraversal(root.right, level+1, ans);
	}
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		int n = levels(root);
		for(int i=0;i<n;i++){
			ans.add(0);
		}
		preorderTraversal(root, 0, ans);
		return ans;
	}
}
