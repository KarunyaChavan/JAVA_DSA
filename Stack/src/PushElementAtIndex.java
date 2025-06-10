import java.util.Stack;

public class PushElementAtIndex {
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

		//Pushing at bottom
		int new_ele = 7;
		st.push(new_ele);
		while(!temp.isEmpty()){
			st.push(temp.pop());
		}
		System.out.print("After Inserting 7 at Bottom : ");
		System.out.println(st);

		//Inserting at an Index
		int index = 2;
		int new_ele_2 = 77;
		if(index >= st.size()){
			System.out.println("Invalid Index");
		}
		else {
			while ((st.size()) > index) {
				temp.push(st.pop());
			}
			st.push(new_ele_2);
			while(!temp.isEmpty()){
				st.push(temp.pop());
			}
			System.out.print("After Inserting 77 at index 2 : ");
			System.out.println(st);
		}
	}
}
