//LEETCODE 102
package LeetcodeQuestions;
import java.util.*;

public class LevelOrderTraversal_102 {
	public void getElementsOfLevel(TreeNode root, int level, int n, List<Integer> arr){
		if(root==null) return;
		//tried to optimise by dismissing further traversal when all levels are covered
		if(level>n) return;
		if(level==n) arr.add(root.val);
		getElementsOfLevel(root.left, level+1, n, arr); //completing the left subtree first
		getElementsOfLevel(root.right, level+1, n, arr);
	}
	public int levels(TreeNode root){
		if(root==null) return 0;
		return 1 + Math.max(levels(root.left), levels(root.right));
	}
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();
		int lvls = levels(root);
		for(int i=0;i<=(lvls-1);i++){
			List<Integer> arr = new ArrayList<>();
			getElementsOfLevel(root, 0, i, arr);
			ans.add(arr);
		}
		return ans;
	}
}
