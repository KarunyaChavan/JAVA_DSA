class Stack{
	private int[] arr;
	private int top;
	private int size;
	private int max_size;

	Stack(int max_size){
		this.top = -1;
		this.max_size = max_size;
		arr = new int[max_size];
		for(int i=0;i<max_size;i++) arr[i] = -1;
	}

	void push(int ele){
		if(size >= max_size){
			System.out.println("Overflow occured, element can't be inserted");
			return;
		}
		arr[++top] = ele;
		size++;
	}

	int pop(){
		if(top==-1){
			System.out.println("Underflow occured, no elements to be popped");
			return -1;
		}
		int ele = arr[top];
		arr[top--] = -1;
		size--;
		return ele;
	}

	void peek(){
		System.out.println(arr[top]);
	}

	boolean isEmpty(){
		return (top==-1);
	}

	int size(){
		return this.size;
	}
	void display(){
		for(int i=top;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}

public class ArrayImplementationOfStack {
	public static void main(String[] args) {
		Stack st = new Stack(5);
		for(int i=0;i<5;i++){
			st.push(i+1);
		}
		st.display();
		st.push(6);
		st.pop();
		st.peek();
		System.out.println(st.isEmpty());
		System.out.println("Size of Stack : " + st.size());
	}
}
