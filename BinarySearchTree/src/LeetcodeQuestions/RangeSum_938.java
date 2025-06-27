//LEETCODE 938
package LeetcodeQuestions;

class RangeSum_938 {
	public int rangeSumBST(TreeNode root, int low, int high) {
		return rangeSum(root, low, high);
	}

	public int rangeSum(TreeNode root, int low, int high) {
		if (root == null) {
			return 0;
		}

		int sum = 0;

		if (root.val >= low && root.val <= high) {
			sum += root.val;
		}

		if (root.val > low) {
			sum += rangeSum(root.left, low, high);
		}

		if (root.val < high) {
			sum += rangeSum(root.right, low, high);
		}

		return sum;
	}
}
