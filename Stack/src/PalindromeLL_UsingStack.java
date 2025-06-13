//LEETCODE 234
import java.util.Stack;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class PalindromeLL_UsingStack {
	//USING STACK
	public boolean isPalindrome(ListNode head) {
		Stack<ListNode> reversed = new Stack<>();
		ListNode temp = head;
		while(temp!=null){
			reversed.push(temp);
			temp = temp.next;
		}
		while(head!=null && !reversed.isEmpty()){
			if(reversed.pop().val!=head.val) return false;
			head = head.next;
		}
		return true;
	}
}
