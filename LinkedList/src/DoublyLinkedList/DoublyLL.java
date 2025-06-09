package DoublyLinkedList;

class DoublyNode{
	int val;
	DoublyNode next;
	DoublyNode prev;

	DoublyNode(int val){
		this.val = val;
		this.next = null;
		this.prev = null;
	}
}

class DLL{
	private DoublyNode head;
	private DoublyNode tail;
	private int size;

	DLL(){
		this.head = null;
		this.tail = null;
		size = 0;
	}

	void display(){
		DoublyNode temp = head;
		while(temp != null){
			System.out.print(temp.val + " --> ");
			temp = temp.next;
		}
		System.out.println();
	}

	void displayReversed(){
		DoublyNode temp = tail;
		while(temp != null){
			System.out.print(temp.val + " --> ");
			temp = temp.prev;
		}
		System.out.println();
	}

	void insertAtTail(int val){
		DoublyNode node = new DoublyNode(val);
		if(size==0) head = tail = node;
		else{
			node.prev = tail;
			tail.next = node;
			tail = node;
		}
		size++;
		return;
	}

	void insertAtHead(int val){
		DoublyNode node = new DoublyNode(val);
		if(size==0) head = tail = node;
		else{
			node.next = head;
			head.prev = node;
			head = node;
		}
		size++;
	}

	void insertAtIndex(int index, int val){
		if(size<=index){
			System.out.println("Invalid Index");
			return;
		}
		if(index==0){
			insertAtHead(val);
			return;
		}
		int idx = 0;
		DoublyNode temp = this.head;
		while(idx!=index){
			temp = temp.next;
			idx++;
		}
		DoublyNode node = new DoublyNode(val);
		node.next = temp;
		node.prev = temp.prev;
		temp.prev.next = node;
		temp.prev = node;
		size++;
	}

	void deleteAtHead(){
		head = head.next;
		head.prev = null;
		size--;
	}

	void deleteAtTail(){
		tail = tail.prev;
		tail.next.prev = null;
		tail.next = null;
		size--;
	}

	void size(){
		System.out.println("Current Length of Linked List : "+ size);
	}
}

public class DoublyLL {
	public static void main(String[] args) {
		DLL list = new DLL();
		//Appending nodes
		for(int i=0;i<5;i++){
			list.insertAtTail(i+1);
		}
		System.out.println("After appending 1 to 5");
		list.display();
		System.out.print("Current Size : ");
		list.size();
		System.out.println("Inserting 7 at head");
		list.insertAtHead(7);
		list.display();
		System.out.println("After inserting 77 at index 2");
		list.insertAtIndex(2,77);
		list.display();
		list.size();

	}
}
