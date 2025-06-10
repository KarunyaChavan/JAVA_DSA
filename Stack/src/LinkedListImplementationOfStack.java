class Node{
	int val;
	Node next;
	Node(int val){
		this.val = val;
		this.next = null;
	}
}

class StackLL{
	Node head;
	private int size;

	StackLL(){
		this.head = null;
		this.size = 0;
	}

	void push(int val){
		Node new_node = new Node(val);
		if(head==null) head = new_node;
		else {
			new_node.next = head;
			head = new_node;
		}
		size++;
	}

	int pop(){
		if(size==0){
			System.out.println("Underflow Occurred");
			return -1;
		}
		Node top_ele = head;
		head = head.next;
		size--;
		return top_ele.val;
	}

	void peek(){
		System.out.println(head.val);
	}

	boolean isEmpty(){
		return (head==null);
	}

	int size(){
		return this.size;
	}

	void displayR(Node temp){
		if(temp==null) return;
		System.out.println(temp.val);
		displayR(temp.next);
	}
}

public class LinkedListImplementationOfStack {
	public static void main(String[] args) {
		StackLL st = new StackLL();
		for(int i=0;i<5;i++) st.push(i+1);
		System.out.println("After pushing 5 new elements");
		st.displayR(st.head);
		System.out.println("Current Size : " + st.size());
		System.out.print("Element at Top : ");
		st.peek();
		System.out.println("After Popping 2 elements");
		st.pop();
		st.pop();
		System.out.print("Current Top ELement : ");
		st.peek();
		System.out.println("Current Size : " + st.size());
	}
}
