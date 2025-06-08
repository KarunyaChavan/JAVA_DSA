//LEETCODE 234

public class PalindromeLL {
	public ListNode reverseList(ListNode head) {
		if(head==null || head.next==null) return head;
		ListNode a = head.next;
		ListNode newHead = reverseList(a);
		a.next = head;
		head.next = null;
		return newHead;
	}
	//HALF REVERSING METHOD
	public boolean isPalindrome(ListNode head) {
		if(head.next==null) return true;
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode t2 = reverseList(slow);
		ListNode t1 = head;
		while(t2!=null){
			if(t1.val!=t2.val) return false;
			t1 = t1.next;
			t2 = t2.next;
		}
		return true;
	}
}
