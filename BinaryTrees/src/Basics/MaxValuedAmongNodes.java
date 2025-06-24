package Basics;

public class MaxValuedAmongNodes {
	static int findMaxNode(Node root){
		if(root==null) return Integer.MIN_VALUE;
		return Math.max(root.val, Math.max(findMaxNode(root.left), findMaxNode(root.right)));
	}

	static int getSize(Node root){
		if(root==null) return 0;
		return 1 + getSize(root.left) + getSize(root.right);
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(5);
		root.left = a; root.right = b;
		a.left = c; a.right = d;

		System.out.println("Max Value in the Tree : " + findMaxNode(root));
		System.out.println("Size of Tree : " + getSize(root));
	}
}
