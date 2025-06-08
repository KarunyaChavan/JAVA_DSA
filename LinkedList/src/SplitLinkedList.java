//LEETCODE 725
public class SplitLinkedList {
	//Larger = n/k + 1
	//smaller = n/k
	public int getLengthOfList(ListNode head){
		int n = 0;
		ListNode temp = head;
		while(temp!=null){
			temp = temp.next;
			n++;
		}
		return n;
	}

	public ListNode[] splitListToParts(ListNode head, int k) {
		int n = getLengthOfList(head);
		int size = n/k;
		int extra = n%k;
		ListNode[] arr = new ListNode[k];
		int idx = 0;
		ListNode temp = head;
		int len = 1;
		while(temp!=null) {
			int s = size;//size of specific part
			if (extra > 0) s++;
			if (len == 1) arr[idx++] = temp;
			if (len == s) {
				ListNode a = temp.next;
				temp.next = null;
				temp = a;
				len = 1;
				extra--;
			} else {
				len++;
				temp = temp.next;
			}
		}

        return arr;
	}
}
