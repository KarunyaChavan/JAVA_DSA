//LEETCODE 114
package LeetcodeQuestions;
import java.util.*;

public class FlattenBinaryTreeToLInkedList_114 {
	//Method 1 : Using Preorder (Scope for S.C improvement)
	public void preorder(TreeNode root, List<TreeNode> pre){
		if(root==null) return;
		pre.add(root);
		preorder(root.left,pre);
		preorder(root.right,pre);
	}
	public void flatten(TreeNode root) {
		List<TreeNode> pre = new ArrayList<>();
		preorder(root, pre);
		for(int i=0;i<pre.size();i++){
			if(i!=pre.size()-1) pre.get(i).right = pre.get(i+1);
			pre.get(i).left = null;
		}
	}

	//Method 2: Rescursively Flattening each subtree
	public void flatten2(TreeNode root) {
		if(root==null) return;
		if(root.left==null && root.right==null) return;
		TreeNode lst = root.left;
		TreeNode rst = root.right;
		flatten2(lst);
		flatten2(rst);
		root.left = null;
		root.right = lst;
		TreeNode temp = root;
		while(temp.right!=null)
			temp = temp.right;
		temp.right = rst;
	}

	//Method 3: Somewhat similar to Morris Traversal (TC = O(n) but SC = O(1))
	public void flatten3(TreeNode root) {
		TreeNode curr = root;
		while(curr!=null){
			if(curr.left!=null){
				TreeNode r = curr.right;
				curr.right = curr.left;
				TreeNode pred = curr.left;
				while(pred.right!=null) pred = pred.right;
				pred.right = r;
				curr.left = null; //imp
				curr = curr.right;
			}
			else{
				curr = curr.right;
			}
		}
	}
}
