class DeNode{
	int val;
	DeNode next;
	DeNode prev;
	DeNode(int val){
		this.val = val;
		this.next = null;
		this.prev = null;
	}
}

class DeQueue{
		private DeNode front;
		private DeNode rear;
		private int size;

		DeQueue(){
			this.front = this.rear = null;
			this.size = 0;
		}

		boolean isEmpty(){
			return (size==0);
		}

		void insertFront(int val){
			DeNode new_node = new DeNode(val);
			if(size==0){
				this.rear = this.front = new_node;
			}
			else {
				new_node.next = front;
				front.prev = new_node;
				front = new_node;
			}
			this.size++;
		}

		void insertRear(int val){
			DeNode new_node = new DeNode(val);
			if(size==0){
				this.rear = this.front = new_node;
			}
			else {
				new_node.prev = rear;
				rear.next = new_node;
				rear = new_node;
			}
			this.size++;
		}

		void deleteFront(){
			if(size==0){
				System.out.println("Queue is empty");
				return;
			}
			else{
				front = front.next;
				if(front==null) rear = null;
				else front.prev = null;
				this.size--;
			}
		}

	void deleteRear(){
		if(size==0){
			System.out.println("Queue is empty");
			return;
		}
		else{
			rear = rear.prev;
			if(rear==null) front = null;
			else rear.next = null;
			this.size--;
		}
	}

	void display(){
			DeNode temp = front;
			while(temp!=null){
				System.out.print(temp.val + " <-> ");
				temp = temp.next;
			}
		System.out.println("NULL");
	}

	int getFront(){
		if(size==0){
			System.out.println("Queue is empty");
			return -1;
		}
		return front.val;
	}

	int getRear(){
		if(size==0){
			System.out.println("Queue is empty");
			return -1;
		}
		return rear.val;
	}

	int getSize(){
			return this.size;
	}
}

public class DequeImplementation {
	public static void main(String[] args) {
		DeQueue deq = new DeQueue();
		for(int i=1;i<=4;i++)
			deq.insertFront(i);
		deq.insertRear(0);
		deq.display();
		System.out.println("Current Size : " + deq.getSize());
	}
}
