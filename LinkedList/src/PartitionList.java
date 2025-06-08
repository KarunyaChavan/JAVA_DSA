//LEETCODE 86

public class PartitionList {
	public ListNode partition(ListNode head, int x) {
		ListNode dummy1 = new ListNode(-1);
		ListNode dummy2 = new ListNode(-1);
		ListNode tempa = dummy1;
		ListNode tempb = dummy2;
		ListNode temp = head;
		while(temp!=null){
			if(temp.val < x){
				tempa.next = temp;
				tempa = tempa.next;
			}
			else{
				tempb.next = temp;
				tempb = tempb.next;
			}
			temp = temp.next;
		}
		tempb.next = null;
		dummy1 = dummy1.next;
		dummy2 = dummy2.next;
		if(dummy1==null) return dummy2;
		tempa.next = dummy2;
		return dummy1;
	}
}
