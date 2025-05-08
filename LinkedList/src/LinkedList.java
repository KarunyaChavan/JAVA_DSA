class Node{
	int val;
	Node next;
	Node(int val){
		this.val = val;
	}
}

class SLL{
	private Node head;
	private Node tail;
	private int size;

	//Insertion Methods
	void insertAtHead(int val){
		Node temp = new Node(val);
		if(head == null) head = tail = temp;
		else{
			temp.next = head;
			head = temp;
		}
		size++;
	}
	void insertAtTail(int val){
		Node temp = new Node(val);
		if(head == null) head = tail = temp;
		else{
			tail.next = temp;
			tail = temp;
		}
		size++;
	}

	void insertAtIndex(int idx, int val) {
		if (idx == 0) insertAtHead(val);
		else if (idx == size) insertAtTail(val);
		else if (idx < 0 || idx > size) {
			System.out.println("Invalid index");
			size();
			return;
		} else {
			Node temp = new Node(val);
			Node ptr = head;
			for (int i = 0; i < idx - 1; i++) {
				ptr = ptr.next;
			}
			temp.next = ptr.next;
			ptr.next = temp;
			size++;
		}
	}

	//Reading Methods
	int getElement(int idx) throws Error{
		if(idx == 0) return head.val;
		else if(idx == size - 1) return tail.val;
		else if(idx < 0 || idx > size){
			throw new Error("Invalid Index");
		}
		else{
			Node ptr = head;
			for (int i = 0; i < idx; i++) {
				ptr = ptr.next;
			}
			return ptr.val;
		}
	}

	//Updating Method
	void set(int idx, int val) throws Error{
		if(idx == 0){
			head.val = val;
			return;
		}
		else if(idx == size - 1) {
			tail.val = val;
			return;
		}
		else if(idx < 0 || idx > size){
			throw new Error("Invalid Index");
		}
		else{
			Node ptr = head;
			for (int i = 0; i < idx; i++) {
				ptr = ptr.next;
			}
			ptr.val = val;
		}
	}

	//Deleting Methods
	void deleteAtHead(){
			if(head == null) throw new Error("List is empty");
			head = head.next;
			size--;
	}
	void deleteAtIndex(int idx) throws Error{
		if(head == null) throw new Error("List is empty");
		if(idx == 0){
			deleteAtHead();
			return;
		} else if (idx == size - 1) {
			deleteAtTail();
			return;
		} else if(idx < 0 || idx > size){
			throw new Error("Invalid Index");
		}
		else{
			Node temp = head;
			for(int i=0; i < idx - 1; i++){
				temp = temp.next;
			}
			temp.next = temp.next.next;
			size--;
		}
	}

	void deleteAtTail(){
		if(head == null) throw new Error("List is empty");
		Node temp = head;
		while(temp.next != tail){
			temp = temp.next;
		}
		tail = temp;
		tail.next = null;
		size--;
	}

	//Display Method
	void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.val + " --> ");
			temp = temp.next;
		}
		System.out.println();
	}
	void size(){
		System.out.println("Current Length of Linked List : "+ size);
	}
}

public class LinkedList {

	public static void main(String[] args) {
		SLL list = new SLL();
		list.insertAtHead(1);
		list.insertAtHead(2);
		list.insertAtHead(4);
		list.display();
		list.insertAtTail(5);
		list.insertAtTail(6);
		list.insertAtIndex(2,3);
		list.insertAtIndex(0,7);
		list.display();
		System.out.println("Element at Index 4 : " + list.getElement(4));
		System.out.println("Updating element at index 2");
		list.set(2,100);
		list.display();
		list.deleteAtHead();
		System.out.println("After Deleting element at index 0");
		list.display();
		System.out.println("After De.0leting element at index 1");
		list.deleteAtIndex(1);
		list.display();
		list.size();

	}
}
