//LEETCODE 236
package LeetcodeQuestions;

public class LowestCommonAncestorOfBinaryTree_236 {
	public boolean exists(TreeNode root, TreeNode node){
		if(root==node) return true;
		if(root==null) return false;
		return exists(root.left, node) || exists(root.right, node);
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(p==root || q==root) return root;
		//checking where does p lies
		boolean p_in_left = exists(root.left, p);
		boolean q_in_left = exists(root.left, q);
		//if p and q both lies in left subtree
		if(p_in_left && q_in_left) return lowestCommonAncestor(root.left, p, q);
		//if both lies in right subtree
		if(!p_in_left && !q_in_left) return lowestCommonAncestor(root.right, p, q);
			//and when they lie alternatively
		else return root;
	}
}
