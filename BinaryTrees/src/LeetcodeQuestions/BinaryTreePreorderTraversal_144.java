package LeetcodeQuestions;
import java.util.*;

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

public class BinaryTreePreorderTraversal_144 {
	static void helper(TreeNode root, List<Integer> ans){
		if(root==null) return;
		ans.add(root.val);
		helper(root.left, ans);
		helper(root.right, ans);
	}

	//Recursive (Auxilary SC = O(n))
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		helper(root, ans);
		return ans;
	}

	//Iterative (Auxilary SC = O(ln(n)))
	public List<Integer> preorderTraversalIter(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		Stack<TreeNode> st = new Stack<>();
		if(root!=null) st.push(root);
		while(!st.isEmpty()){
			TreeNode top = st.pop();
			ans.add(top.val);
			if(top.right!=null) st.push(top.right); //as stack follows lifo, so we pushed right first to get left first
			if(top.left!=null) st.push(top.left);
		}
		return ans;
	}
}