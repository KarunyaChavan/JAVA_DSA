class CircularQueue{
	private int front;
	private int rear;
	private int size;
	private int[] arr;

	CircularQueue(int max_size){
		arr = new int[max_size];
		this.front = -1;
		this.rear = -1;
		this.size = 0;
	}

	void add(int val){
		if(size == arr.length){
			System.out.println("Queue is filled");
			return;
		}
		else if(size==0){
			this.front = this.rear = 0;
			arr[front] = val;
		}
		else if(rear < arr.length - 1){
			arr[++rear] = val;
		}
		else if(rear == arr.length - 1){
			rear = 0;
			arr[rear] = val;
		}
		this.size++;
	}

	int remove(){
		if(size==0){
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			int ele = arr[front];
			if(front == arr.length - 1) front = 0;
			else front++;
			this.size--;
			return ele;
		}
	}

	int peek(){
		if(size==0){
			System.out.println("Queue is empty");
			return -1;
		}
		return arr[front];
	}

	int getSize(){
		return this.size;
	}

	void display(){
		if(size==0){
			System.out.println("Queue is empty");
			return;
		}
		if(front <= rear){
			for(int i=front; i <= rear; i++){
				System.out.print(arr[i] + ", ");
			}
			System.out.println();
		}
		else{
			for(int i=front;i <= arr.length;i++)
				System.out.print(arr[i] + ", ");
			for(int i=0;i<=rear;i++)
				System.out.print(arr[i] + ", ");
			System.out.println();
		}
	}

	boolean isEmpty(){
		return (size==0);
	}
}

public class CircularQueueImplementation {
	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(5);
		for(int i=1;i<=4;i++)
			q.add(i);
		q.display();
		System.out.println("Removed : " + q.remove());
		System.out.println("Current Size : " + q.getSize());
	}
}
