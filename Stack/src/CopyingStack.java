import java.util.Stack;

public class CopyingStack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.print("Original Stack : ");
		System.out.println(st);
		//Creating a temporary stack
		Stack<Integer> temp = new Stack<>();

		while(!st.isEmpty()){
			temp.push(st.pop());
		}
		//Creating deepcopy of stack st
		Stack<Integer> cpst = new Stack<>();

		while(!temp.isEmpty()){
			cpst.push(temp.pop());
		}
		System.out.print("Copied Stack : ");
		System.out.println(cpst);
	}
}
