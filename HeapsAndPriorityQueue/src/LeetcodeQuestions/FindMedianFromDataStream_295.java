package LeetcodeQuestions;

import java.util.Collections;
import java.util.PriorityQueue;

class FindMedianFromDataStream_295 {
	//after trying arraylists and getting tle, trying dual heaps approach

	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	public void addNum(int num) {
		if(maxHeap.size()==0) maxHeap.add(num);
		else{
			if(num < maxHeap.peek()) maxHeap.add(num);
			else minHeap.add(num);
		}
		//Balancing the heaps
		if(maxHeap.size() == minHeap.size() + 2){
			int top = maxHeap.remove();
			minHeap.add(top);
		}
		if(minHeap.size() == maxHeap.size() + 2){
			int top = minHeap.remove();
			maxHeap.add(top);
		}
	}

	public double findMedian() {
		if(maxHeap.size() == minHeap.size()) return (maxHeap.peek() + minHeap.peek())/2.0;
		else if(maxHeap.size() > minHeap.size()) return maxHeap.peek();
		else return minHeap.peek();
	}
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */