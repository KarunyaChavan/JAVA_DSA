package Basics;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinHeap {
	public static void main(String[] args) {
		//for minheap
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_" + " MIN-HEAP " + "_-_-_-_-_-_-_-_-_-_-_-_-_");
		pq.add(2); //TC = O(logn)
		System.out.println("After adding 2 : " + pq);
		pq.add(10);
		System.out.println("After adding 10 : " + pq);
		pq.add(1);
		System.out.println("After adding 1 : " + pq);
		pq.remove(); //TC = O(logn)
		System.out.println("After removing element : " + pq);
		pq.add(0);
		System.out.println("After adding 0 : " + pq);
		System.out.println("Current Top : " + pq.peek());
		/*
		* Minheap v/s Arraylist : Making arraylist work like heap will cost O(nlogn) for adding
		* 						  but in case of minheap, it costs only O(logn)
		* */
		//for maxheap
		PriorityQueue<Integer> pq_max = new PriorityQueue<>(Collections.reverseOrder());
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_" + " MAX-HEAP " + "_-_-_-_-_-_-_-_-_-_-_-_-_");
		pq_max.add(2); //TC = O(logn)
		System.out.println("After adding 2 : " + pq_max);
		pq_max.add(10);
		System.out.println("After adding 10 : " + pq_max);
		pq_max.add(1);
		System.out.println("After adding 1 : " + pq_max);
		pq.remove(); //TC = O(logn)
	}
}