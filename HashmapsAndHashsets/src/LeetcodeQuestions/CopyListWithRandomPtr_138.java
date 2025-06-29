//LEETCODE 138
package LeetcodeQuestions;
import java.util.HashMap;

class LinkNode {
	int val;
	LinkNode next;
	LinkNode random;

	public LinkNode(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
}

public class CopyListWithRandomPtr_138 {
	//USING HASHMAP
	public LinkNode deepCopy(LinkNode head){
		LinkNode newHead = new LinkNode(head.val);
		LinkNode t1 = head.next;
		LinkNode t2 = newHead;
		while(t1!=null){
			LinkNode temp = new LinkNode(t1.val);
			t2.next = temp;
			t2 = t2.next;
			t1 = t1.next;
		}
		return newHead;
	}

	public LinkNode copyRandomList(LinkNode head) {
		if(head==null) return null;
		LinkNode copied_head = deepCopy(head);
		HashMap<LinkNode, LinkNode> map = new HashMap<>(); //<org_node, copied_node>
		LinkNode temp1 = head, temp2 = copied_head;
		while(temp1!=null){
			map.put(temp1, temp2);
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		for(LinkNode original : map.keySet()){
			LinkNode duplicate = map.get(original);
			if(original.random!=null)
				duplicate.random = map.get(original.random);
		}
		return copied_head;
	}
}
