package Basics;

class Node{
	int val;
	Node right, left;
	Node(int val){
		this.val = val;
		this.left = null; this.right = null;
	}
}

public class IsBTaMaxHeap {
	static void displayTreeRecursive(Node root){
		if(root==null) return;
		System.out.print(root.val + " ");
		displayTreeRecursive(root.left); //completing the left subtree first
		displayTreeRecursive(root.right);
	}

	public static boolean isMaxHeap(Node root){
		Integer n = size(root);
		return isHeap(root) && isCBT(root,0,n);
	}

	private static int size(Node root){
		if(root==null) return 0;
		return 1 + size(root.left) + size(root.right);
	}
	private static boolean isCBT(Node root, int i, Integer n) {
		if(root==null) return true;
		if(i>=n) return false;
		return isCBT(root.left, 2*i+1,n) && isCBT(root.right, 2*i+2,n);
	}

	private static boolean isHeap(Node root) {
		if(root==null) return true;
		if(root.left!=null){
			if(root.val < root.left.val) return false;
		}
		if(root.right!=null){
			if(root.val < root.right.val) return false;
		}
		return isHeap(root.left) && isHeap(root.right);
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		Node a = new Node(8);
		Node b = new Node(5);
		Node c = new Node(6);
		Node d = new Node(7);
		root.left = a; root.right = b;
		a.left = c; a.right = d;
		displayTreeRecursive(root);
		System.out.println("\nIs Heap : " + isMaxHeap(root));
	}
}
