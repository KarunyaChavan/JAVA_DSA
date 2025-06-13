//LEETCOE 155
import java.util.Stack;

public class MinStack {
	//APPROACH 1 - USING TWO STACKS
	Stack<Integer> st;
	Stack<Integer> min;
	public MinStack() {
		st = new Stack<>();
		min = new Stack<>();
	}

	public void push(int val) {
		st.push(val);
		if(min.isEmpty() || min.peek() >= st.peek()) min.push(val);
	}

	public void pop() {
		if(!st.isEmpty()){
			int val = st.pop();
			if(val == min.peek()) min.pop();
		}
	}

	public int top() {
		if(!st.isEmpty()) return st.peek();
		else return -1;
	}

	public int getMin() {
		if(min.isEmpty()) return -1;
		return min.peek();
	}
}

class SingleMinStack {
	//APPROACH 2 - USING SINGLE STACK
	int min;
	Stack<Integer> st;
	public SingleMinStack() {
		min = Integer.MAX_VALUE;
		st = new Stack<>();
	}

	public void push(int val) {
		if(val <= min){
			st.push(min);
			min = val;
		}
		st.push(val);
	}

	public void pop() {
		if(st.pop() == min) min = st.pop();
	}

	public int top() {
		return st.peek();
	}

	public int getMin() {
		return min;
	}
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */