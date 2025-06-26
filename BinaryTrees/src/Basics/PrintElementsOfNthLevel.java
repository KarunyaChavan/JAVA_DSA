package Basics;
import java.util.*;

public class PrintElementsOfNthLevel {
	static void getElementsOfLevel(Node root, int level, int n){
		if(root==null) return;
		if(level==n) System.out.print(root.val + " ");
		getElementsOfLevel(root.left, level+1, n); //completing the left subtree first
		getElementsOfLevel(root.right, level+1, n);
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

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		getElementsOfLevel(a,0, n);
	}
}
