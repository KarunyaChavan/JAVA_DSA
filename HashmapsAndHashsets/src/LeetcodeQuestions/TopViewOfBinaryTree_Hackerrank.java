//HACKERRANK - TREE:TOP VIEW
package LeetcodeQuestions;
import java.util.*;

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}


public class TopViewOfBinaryTree_Hackerrank {
	public static class Pair{
		Node node;
		int level;
		Pair(Node node, int level){
			this.node = node;
			this.level = level;
		}
	}

	public static void topView(Node root) {
		HashMap<Integer, Integer> map = new HashMap<>();
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(root, 0));
		int minlvl = Integer.MAX_VALUE, maxlvl = Integer.MIN_VALUE;
		while(!q.isEmpty()){
			Pair front = q.remove();
			Node node = front.node;
			int lvl = front.level;
			minlvl = Math.min(minlvl, lvl);
			maxlvl = Math.max(maxlvl, lvl);
			if(!map.containsKey(lvl)){
				map.put(lvl, node.data);
			}
			if(node.left!=null) q.add(new Pair(node.left, lvl-1));
			if(node.right!=null) q.add(new Pair(node.right, lvl+1));
		}
		for(int i=minlvl; i<=maxlvl; i++){
			System.out.print(map.get(i)+" ");
		}
	}
}
