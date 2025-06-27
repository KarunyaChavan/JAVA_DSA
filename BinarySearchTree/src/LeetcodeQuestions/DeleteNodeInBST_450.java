//LEETCODE 450
package LeetcodeQuestions;

public class DeleteNodeInBST_450 {
	public TreeNode inorderPredcessor(TreeNode root){
		TreeNode temp = root.left;
		while(temp.right!=null) temp = temp.right;
		return temp;
	}
	public TreeNode  parent(TreeNode root, TreeNode pred){
		if(root.left==pred || root.right==pred) return root;
		TreeNode temp = root.left;
		while(temp.right!=pred) temp = temp.right;
		return temp;
	}
	public TreeNode deleteNode(TreeNode root, int key) {
		if(root==null) return null;
		if(root.val == key){
			//Case 1: Leaf Nodes
			if(root.left==null && root.right==null) return null;
				//Case 2: Parent having only one child
			else if(root.left==null || root.right==null){
				if(root.left==null) return root.right;
				else return root.left;
			}
			//Case 3: Parent having two children
			else{
				TreeNode pred = inorderPredcessor(root);
				TreeNode pred_parent = parent(root, pred);
				if(root==pred_parent){
					pred.right = root.right;
					return pred;
				}
				pred_parent.right = pred.left;
				pred.left = root.left;
				pred.right = root.right;
				return pred;
			}
		}
		else if(root.val > key){
			root.left = deleteNode(root.left, key);
		}
		else{
			root.right = deleteNode(root.right, key);
		}
		return root;
	}
}
