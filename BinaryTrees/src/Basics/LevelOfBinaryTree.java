package Basics;
//height = level - 1

public class LevelOfBinaryTree {
	static int getLevel(Node root){
		if (root==null) return 0;
		return 1 + Math.max(getLevel(root.left), getLevel(root.right));
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(5);
		root.left = a; root.right = b;
		a.left = c; a.right = d;

		System.out.println("Level of Tree : " + getLevel(root));
	}
}
