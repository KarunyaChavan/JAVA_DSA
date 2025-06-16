import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class ReverseFirstK_Elements {
	public static Queue<Integer> reverse_k_Queue(Queue<Integer> q, int k){
		Stack<Integer> st = new Stack<>();
		int n = q.size() - k;
		while(k-- > 0){
			st.push(q.peek());
			q.poll();

		}
		while(!st.isEmpty()){
			q.add(st.pop());
		}
		for(int i=0;i<n;i++){
			int a = q.peek();
			q.poll();
			q.add(a);
		}
		return q;
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		Queue<Integer> ans = reverse_k_Queue(q,3);
		System.out.println(ans);
	}
}
