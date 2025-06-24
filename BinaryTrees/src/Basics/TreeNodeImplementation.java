package Basics;

class Node{
	int val;
	Node left;
	Node right;
	Node(int val){
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class TreeNodeImplementation {
	static void displayTreeRecursive(Node root){
		if(root==null) return;
		System.out.print(root.val + " ");
		displayTreeRecursive(root.left); //completing the left subtree first
		displayTreeRecursive(root.right);
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(5);
		root.left = a; root.right = b;
		a.left = c; a.right = d;

		//Displaying Tree using Recursive method
		displayTreeRecursive(root);
	}
}