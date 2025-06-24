package LeetcodeQuestions;

public class SameTree_100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if((p==null && q!=null) || (p!=null && q==null)) return false;
		if(p==null && q==null) return true;
		if(p.val != q.val) return false;
		if(!isSameTree(p.left, q.left)) return false;
		if(!isSameTree(p.right, q.right)) return false;
		return true;
	}
}
