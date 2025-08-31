package Basics;

class MinHeapClass{
	int[] arr;
	int size;
	MinHeapClass(int capacity){
		arr = new int[capacity];
	}
	public void add(int num){
		arr[size++] = num;
		upheapify(size-1);

	}
	public void upheapify(int index){
		if(index==0) return;
		int parent = (index-1)/2;
		if(arr[index]<arr[parent]){
			swap(index, parent);
			upheapify(parent);
		}
	}
	public int remove(){
		if(size==0){
			System.out.println("Heap is Empty");
			return -1;
		}
		int peek = arr[0];
		swap(0,size-1);
		size--;
		downHeapify(0);
		return peek;
	}
	public void downHeapify(int index){
		if(index>=size) return;
		int lc = 2*index + 1, rc = 2*index + 2;
		int min_index = index;
		if(lc < size && arr[min_index] > arr[lc]) min_index = lc;
		if(rc < size && arr[min_index] > arr[rc]) min_index = rc;
		if(index==min_index) return;
		swap(index, min_index);
		downHeapify(min_index);
	}
	public void swap(int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public int peek(){
		if(size==0){
			System.out.println("Heap is Empty");
			return -1;
		}
		return arr[0];
	}

}

public class MinHeapImplementationArray {
	public static void main(String[] args) {
		MinHeapClass pq = new MinHeapClass(10);
		pq.add(2);
		pq.add(1);
		pq.add(3);
		System.out.println("Current Size : " + pq.size);
		pq.add(0);
		pq.add(-4);
		System.out.println("Top Peek : " + pq.peek());
		pq.remove();
		System.out.println("Top Peek after Removing : " + pq.peek());
	}
}
