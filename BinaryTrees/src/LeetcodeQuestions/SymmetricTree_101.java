//LEETCODE 101
package LeetcodeQuestions;

public class SymmetricTree_101 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if((p==null && q!=null) || (p!=null && q==null)) return false;
		if(p==null && q==null) return true;
		if(p.val != q.val) return false;
		if(!isSameTree(p.left, q.left)) return false;
		if(!isSameTree(p.right, q.right)) return false;
		return true;
	}
	public void invert(TreeNode root){
		if(root==null || (root.left==null && root.right==null)) return;
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		invert(root.left);
		invert(root.right);
	}
	public boolean isSymmetric(TreeNode root) {
		invert(root.right); //invert either of the subtree and then compare them
		return isSameTree(root.left, root.right);
	}
}
