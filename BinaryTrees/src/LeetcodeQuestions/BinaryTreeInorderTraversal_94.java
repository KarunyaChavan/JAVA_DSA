//LEETCODE 94
package LeetcodeQuestions;
import java.util.*;

class BinaryTreeInorderTraversal_94 {
	static void helper(TreeNode root, List<Integer> ans){
		if(root==null) return;
		helper(root.left, ans);
		ans.add(root.val);
		helper(root.right, ans);
	}

	//Recursive
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		helper(root, ans);
		return ans;
	}

	//USING ITERATIVE APPROACH
	public List<Integer> inorderTraversalIter(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		Stack<TreeNode> st = new Stack<>();
		TreeNode temp = root;
		while(true){
			if(temp!=null){
				st.push(temp);
				temp = temp.left;
			}
			else{
				if(st.isEmpty()) break;
				TreeNode top = st.pop();
				ans.add(top.val);
				temp = top.right;
			}
		}
		return ans;
	}
}