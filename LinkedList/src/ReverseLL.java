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
class ReverseLL {
	//Iterative Method
	public ListNode reverseList(ListNode head) {
		ListNode curr = head, prev = null, nextNode = head;
		while(curr!=null){
			nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		return prev;
	}
	public ListNode reverseListRecursive(ListNode head) {
		if(head==null || head.next==null) return head;
		ListNode a = head.next;
		ListNode newHead = reverseListRecursive(a);
		a.next = head;
		head.next = null;
		return newHead;
	}
}