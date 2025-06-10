import java.util.Stack;

public class ReversingStack {
	public static void displayReversed(Stack<Integer> st){
		if(st.isEmpty()) return;
		int top = st.pop();
		System.out.print(top + " ");
		displayReversed(st);
		st.push(top);
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.print("Elements in Original Stack : ");
		System.out.println(st);
		Stack<Integer> revst = new Stack<>();

		while(!st.isEmpty()){
			revst.push(st.pop());
		}
		System.out.print("Elements in Reversed Stack : ");
		System.out.println(revst);
		System.out.println("Using Recursive Function : ");
		displayReversed(revst);
	}
}