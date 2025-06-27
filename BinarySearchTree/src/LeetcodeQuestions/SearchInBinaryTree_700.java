//LEETCODE 700
package LeetcodeQuestions;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
		  this.val = val;
		  this.left = left;
		  this.right = right;
	}
 }

public class SearchInBinaryTree_700 {
	public TreeNode searchBST(TreeNode root, int val) {
		if(root==null) return null;
		if(root.val < val) return searchBST(root.right, val);
		else if(root.val > val) return searchBST(root.left, val);
		else return root;
	}
}
