//LEETCODE 98
package LeetcodeQuestions;
import java.util.*;

public class ValidateBST_98 {
	//METHOD 1
	public int max(TreeNode root){
		if (root == null) return Integer.MIN_VALUE;
		return Math.max(root.val, Math.max(max(root.left), max(root.right)));
	}

	public int min(TreeNode root){
		if (root == null) return Integer.MAX_VALUE;
		return Math.min(root.val, Math.min(min(root.left), min(root.right)));
	}

	public boolean isValidBST(TreeNode root) {
		if (root == null) return true;
		if (root.left != null && max(root.left) >= root.val) return false;
		if (root.right != null && min(root.right) <= root.val) return false;
		return isValidBST(root.left) && isValidBST(root.right); // Recursively validate subtrees
	}

	//METHOD 2 : Just verify whether inorder is sorted
	public void inorder(TreeNode root, List<Integer> arr){
		if(root==null) return;
		inorder(root.left, arr);
		arr.add(root.val);
		inorder(root.right, arr);
	}
	public boolean isValidBST2(TreeNode root) {
		List<Integer> arr = new ArrayList<>();
		inorder(root, arr);
		for(int i=1;i<arr.size();i++){
			if(arr.get(i) <= arr.get(i-1)) return false; //as bst gives sorted inorder
		}
		return true;
	}
}
