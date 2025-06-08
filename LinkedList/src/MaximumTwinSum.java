//LEETCODE 2130

public class MaximumTwinSum {
	public ListNode reverseList(ListNode head) {
		if(head==null || head.next==null) return head;
		ListNode a = head.next;
		ListNode newHead = reverseList(a);
		a.next = head;
		head.next = null;
		return newHead;
	}

	public int pairSum(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode t2 = reverseList(slow);
		int maxval = -1;
		ListNode t1 = head;
		while(t2!=null){
			if((t1.val + t2.val) > maxval) maxval = t1.val + t2.val;
			t1 = t1.next;
			t2 = t2.next;
		}
		return maxval;
	}
}
