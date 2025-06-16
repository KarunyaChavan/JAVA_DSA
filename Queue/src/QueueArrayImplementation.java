class QueueArr{
	int f;
	int r;
	int size;
	int[] arr;

	QueueArr(int max_size){
		this.arr = new int[max_size];
		f = -1;
		r = -1;
		size = 0;
	}

	void add(int val){
		if(r == arr.length - 1){
			System.out.println("Queue is Full");
			return;
		}
		if(f == -1 && r == -1){
			f = r = 0;
			arr[r] = val;
		}
		else{
			arr[++r] = val;
		}
		size++;
	}

	public int remove(){
		if(size == 0){
			System.out.println("Queue is empty");
			return -1;
		}
		int ele = arr[f++];
		size--;
		return ele;
	}

	public int peek(){
		if(size == 0){
			System.out.println("Queue is empty");
			return -1;
		}
		return arr[f];
	}

	public boolean isEmpty(){
		return (size == 0);
	}

	public void display(){
		if(size == 0){
			System.out.println("Queue is empty");
			return;
		}
		else{
			for(int i=f;i<=r;i++){
				System.out.print(arr[i] + ", ");
			}
			System.out.println();
		}
	}
}

public class QueueArrayImplementation {
	public static void main(String[] args) {
		QueueArr q = new QueueArr(5);
		for(int i=1;i<=4;i++)
			q.add(i);
		q.display();
		System.out.println("Removed : " + q.remove());
		System.out.println("Current Size : " + q.size);
	}
}