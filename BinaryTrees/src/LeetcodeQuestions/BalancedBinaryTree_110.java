//LEETCODE 110
package LeetcodeQuestions;

public class BalancedBinaryTree_110 {
	//METHOD 1
	public int levels(TreeNode root){
		if(root==null) return 0;
		return 1 + Math.max(levels(root.left), levels(root.right));
	}
	public boolean isBalanced(TreeNode root) {
		if(root==null) return true;
		int diff = Math.abs(levels(root.left) - levels(root.right));
		if(diff > 1) return false;
		// boolean lst = isBalanced(root.left); //checking in left subtree
		// if(lst==false) return false;
		// boolean rst = isBalanced(root.right);
		// if(rst==false) return false;
		// return true;
		return isBalanced(root.left) && isBalanced(root.right);
	}

	//METHOD 2
	static boolean ans;
	public int levels2(TreeNode root){
		if(root==null) return 0;
		int left_lvl = levels(root.left);
		int right_lvl = levels(root.right);
		int diff = Math.abs(left_lvl - right_lvl);
		if(diff > 1) ans = false;
		return 1 + Math.max(left_lvl, right_lvl);
	}
	public boolean isBalanced2(TreeNode root) {
		ans = true;
		levels(root);
		return ans;
	}
}
