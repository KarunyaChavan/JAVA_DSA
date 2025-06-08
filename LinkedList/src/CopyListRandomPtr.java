//LEETCODE 138
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


class Solution {
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
		if(head==null) return head;
		//Step 1: Creating a deep copy without random connections
		LinkNode copiedHead = deepCopy(head);
		//Step 2: Joining original and copied linked list with alternative connections
		LinkNode dummy = new LinkNode(-1);
		LinkNode temp = dummy;
		LinkNode t1 = head;
		LinkNode t2 = copiedHead;
		while(t1!=null && t2!=null){ //length equal hai so
			temp.next = t1;
			temp = t1;
			t1 = t1.next;
			temp.next = t2;
			temp = t2;
			t2 = t2.next;
		}
		//Step 3: Assign random pointers - t2.random = t1.random.next (next referred because it should point within the list, and next points to the same valued node due to alternate pairing)
		t1 = head;
		t2 = copiedHead;
		while(t1!=null){
			t2 = t1.next;
			if(t1.random!=null) t2.random = t1.random.next;
			t1 = t1.next.next;
		}
		//Step 4: Split the LL again
		t1 = head;
		t2 = copiedHead;
		while(t1!=null){
			t1.next = t2.next;
			t1 = t1.next;
			if(t1==null) break;
			t2.next = t1.next;
			t2 = t2.next;
		}
		return copiedHead;
	}
}