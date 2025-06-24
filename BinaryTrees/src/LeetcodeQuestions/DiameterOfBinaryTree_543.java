//LEETCODE 543
package LeetcodeQuestions;

public class DiameterOfBinaryTree_543 {
	public int levels(TreeNode root){
		if(root==null) return 0;
		return 1 + Math.max(levels(root.left),levels(root.right));
	}

	public int diameterOfBinaryTree(TreeNode root) {
		if(root==null) return 0;
		int root_diameter = levels(root.left) + levels(root.right);
		int left_diameter = diameterOfBinaryTree(root.left);
		int right_diameter = diameterOfBinaryTree(root.right);
		return Math.max(root_diameter, Math.max(left_diameter, right_diameter));
	}
}
