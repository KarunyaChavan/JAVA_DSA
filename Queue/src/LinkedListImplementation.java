class Node{
	int val;
	Node next;
	Node(int val){
		this.val = val;
		this.next = null;
	}
}

class QueueList{
	private Node head;
	private Node tail;
	private int size;

	QueueList(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	void add(int val){
		Node new_node = new Node(val);
		if(this.size==0){
			head = tail = new_node;
		}
		else{
			tail.next = new_node;
			tail = new_node;
		}
		this.size++;
	}

	int peek(){
		if(size==0){
			System.out.println("Queue is empty");
			return -1;
		}
		return head.val;
	}

	int remove(){
		if(size==0){
			System.out.println("Queue is empty");
			return -1;
		}
		int ele = head.val;
		head = head.next;
		this.size--;
		return ele;
	}

	boolean isEmpty(){
		return (this.size==0);
	}

	int getSize(){
		return size;
	}

	void display(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
}

public class LinkedListImplementation {
	public static void main(String[] args) {
		QueueList q = new QueueList();
		for(int i=1;i<=4;i++)
			q.add(i);
		q.display();
		System.out.println("Removed : " + q.remove());
		System.out.println("Current Size : " + q.getSize());
	}
}
