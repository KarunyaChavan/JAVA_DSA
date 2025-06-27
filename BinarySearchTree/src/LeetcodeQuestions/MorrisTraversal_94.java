package LeetcodeQuestions;
import java.util.*;

//TC is O(1) and regular case it was O(n)
public class MorrisTraversal_94 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		TreeNode curr = root;
		while (curr != null) {
			if (curr.left != null) { //lst exists and we discover predecessor
				TreeNode pred = curr.left;
				while (pred.right != null && pred.right != curr) {
					pred = pred.right;
				}
				if (pred.right == null) { //link the thread
					pred.right = curr;
					curr = curr.left;
				} else { //unlink the thread
					pred.right = null;
					ans.add(curr.val);
					curr = curr.right;
				}
			} else { //lst doesn't exist
				ans.add(curr.val);
				curr = curr.right;
			}
		}
		return ans;
	}
}
