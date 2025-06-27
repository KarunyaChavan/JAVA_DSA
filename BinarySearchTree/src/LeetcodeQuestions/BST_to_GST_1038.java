package LeetcodeQuestions;
import java.util.*;

public class BST_to_GST_1038 {
	//USING INORDER
	public void inorder(TreeNode root, List<TreeNode> arr){
		if(root==null) return;
		inorder(root.left, arr);
		arr.add(root);
		inorder(root.right, arr);
	}

	public TreeNode bstToGst(TreeNode root) {
		List<TreeNode> ans = new ArrayList<>();
		inorder(root,ans);
		int n = ans.size();
		for(int i=n-2;i>=0;i--){
			ans.get(i).val += ans.get(i+1).val;
		}
		return root;
	}

	static int sum;
	//Method 2 : Without Creating extra list.
	// We can traverse from max node to min node while adding sum to each node.(avoiding need of list)
	public void reversedInorder(TreeNode root){
		if(root==null) return;
		reversedInorder(root.right);
		root.val += sum;
		sum = root.val;
		reversedInorder(root.left);
	}

	public TreeNode bstToGst2(TreeNode root) {
		sum = 0;
		reversedInorder(root);
		return root;
	}
}
