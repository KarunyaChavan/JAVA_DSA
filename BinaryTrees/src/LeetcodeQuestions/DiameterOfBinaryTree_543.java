//LEETCODE 543
package LeetcodeQuestions;

public class DiameterOfBinaryTree_543 {
//	public int levels(TreeNode root){
//		if(root==null) return 0;
//		return 1 + Math.max(levels(root.left),levels(root.right));
//	}
//
//	public int diameterOfBinaryTree(TreeNode root) {
//		if(root==null) return 0;
//		int root_diameter = levels(root.left) + levels(root.right);
//		int left_diameter = diameterOfBinaryTree(root.left);
//		int right_diameter = diameterOfBinaryTree(root.right);
//		return Math.max(root_diameter, Math.max(left_diameter, right_diameter));
//	}

	//METHOD 2 - O(n) (Hint taken from qs 110)
	static int dia;
	public int levels(TreeNode root){
		if(root==null) return 0;
		int left_lvl = levels(root.left);
		int right_lvl = levels(root.right);
		int d = left_lvl + right_lvl;
		dia = Math.max(dia, d);
		return 1 + Math.max(left_lvl,right_lvl);
	}
	public int diameterOfBinaryTree(TreeNode root) {
		dia = 0;
		levels(root);
		return dia;
	}
}
