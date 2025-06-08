//Leetcode 61

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		//Using SLOW-FAST APPROACH - We'll reach tail using FAST and then slow will k node behind fast, so we will jus link slow's next directly to null.
		if(head==null || head.next==null) return head;
		int n = 0;
		ListNode slow = head;
		while(slow!=null){
			slow = slow.next;
			n++;
		}
		k %= n;
		if(k==0) return head;
		slow = head;
		ListNode fast = head;
		for(int i=1;i<=k;i++) fast = fast.next;
		while(fast.next!=null){
			slow = slow.next;
			fast = fast.next;
		}
		ListNode newHead = slow.next;
		slow.next = null;
		fast.next = head;
		return newHead;
	}
}
