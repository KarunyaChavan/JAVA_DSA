package LeetcodeQuestions;

public class BuildTreeFromPreAndInOrders_105 {
	public TreeNode helper(int[] preorder, int[] inorder, int prelow, int prehigh, int inlow, int inhigh){
		if(prelow > prehigh || inlow > inhigh) return null;
		TreeNode root = new TreeNode(preorder[prelow]);
		int r=0;
		while(inorder[r]!=preorder[prelow]) r++;
		int left = r - inlow;
		root.left = helper(preorder, inorder, prelow+1,prelow+left,inlow,r-1);   //extracting left subtree
		root.right = helper(preorder, inorder, prelow+left+1,prehigh,r+1,inhigh);
		return root;
	}
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int n = preorder.length;
		return helper(preorder, inorder, 0, n-1,0,n-1);
	}
}
