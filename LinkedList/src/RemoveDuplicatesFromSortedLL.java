//LEETCODE 83

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class RemoveDuplicatesFromSortedLL {
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null) return head;
		ListNode a = head;
		ListNode b = head;
		while(b!=null){
			if(b.val==a.val) b = b.next;
			else{
				a.next = b;
				a = b;
			}
		}
		a.next = null;
		return head;
	}
}
