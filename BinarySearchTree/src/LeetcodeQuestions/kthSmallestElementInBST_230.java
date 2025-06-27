package LeetcodeQuestions;
import java.util.ArrayList;

public class kthSmallestElementInBST_230 {
	static void inorderTraversal(TreeNode root, ArrayList<Integer> ans){
		if(root==null) return;
		inorderTraversal(root.left, ans);
		ans.add(root.val);
		inorderTraversal(root.right, ans);
	}

	public int kthSmallest(TreeNode root, int k) {
		ArrayList<Integer> ans = new ArrayList<>();
		inorderTraversal(root, ans);
		return ans.get(k-1);
	}
}
