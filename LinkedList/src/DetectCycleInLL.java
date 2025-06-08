//LEETCODE 141 and

//class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; next = null; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
public class DetectCycleInLL {
	//LEETCODE 141
	public boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) return true;
		}
		return false;
	}
	//LEETCODE 142
	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) break;
		}
		ListNode temp = head;
		while(temp!=slow) temp = temp.next;
		return temp;
	}
}
