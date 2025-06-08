//LEETCODE 328

public class OddEvenLists {
	public ListNode oddEvenList(ListNode head) {
		ListNode dummy1 = new ListNode(-1);
		ListNode dummy2 = new ListNode(-1);
		ListNode tempa = dummy1;
		ListNode tempb = dummy2;
		ListNode temp = head;
		int index = 0;
		while(temp!=null){
			if(index%2==0){
				tempa.next = temp;
				tempa = tempa.next;
			}
			else{
				tempb.next = temp;
				tempb = tempb.next;
			}
			temp = temp.next;
			index++;
		}
		tempb.next = null;
		dummy1 = dummy1.next;
		dummy2 = dummy2.next;
		if(dummy1==null) return dummy2;
		tempa.next = dummy2;
		return dummy1;
	}
}
