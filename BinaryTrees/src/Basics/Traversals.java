package Basics;
import java.util.*;

class Pair{
	Node node;
	int level;
	Pair(Node node, int level){
		this.node = node;
		this.level = level;
	}
}
public class Traversals {
	static void preorderTraversal(Node root){
		if(root==null) return;
		System.out.print(root.val + " ");
		preorderTraversal(root.left); //completing the left subtree first
		preorderTraversal(root.right);
	}

	static void levelOrderTraversal(Node root){
		int prev_lvl = 0;
		Queue<Pair> q = new LinkedList<>();
		if(root!=null) q.add(new Pair(root, 0));
		while(q.size()>0){
			Pair front = q.remove();
			if(front.level != prev_lvl){
				System.out.println();
				prev_lvl++;
			}
			System.out.print(front.node.val + " ");
			if(front.node.left!=null) q.add(new Pair(front.node.left, front.level+1));
			if(front.node.right!=null) q.add(new Pair(front.node.right, front.level+1));
		}
	}

	static void inorderTraversal(Node root){
		if(root==null) return;
		inorderTraversal(root.left);
		System.out.print(root.val + " ");
		inorderTraversal(root.right);
	}

	static void postorderTraversal(Node root){
		if(root==null) return;
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root.val + " ");
	}

	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);

		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.left = f; c.right = g;

		//Pre-order Traversal
		System.out.print("PreOrder Traversal : ");
		preorderTraversal(a);
		System.out.println();
		System.out.print("Inorder Traversal : ");
		inorderTraversal(a);
		System.out.println();
		System.out.print("Postorder Traversal : ");
		postorderTraversal(a);
		System.out.println();
		System.out.println("Level Order Traversal : ");
		levelOrderTraversal(a);
	}
}
