//LEETCODE 649
import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
	public String predictPartyVictory(String senate) {
		int n = senate.length();
		Queue<Integer> r = new LinkedList<>();
		Queue<Integer> d = new LinkedList<>();
		for(int i=0;i<n;i++){
			if(senate.charAt(i) == 'R') r.add(i);
			else d.add(i);
		}
		while(!r.isEmpty() && !d.isEmpty()){
			if(r.peek() < d.peek()) r.add(n++);
			else d.add(n++);
			r.remove();
			d.remove();
		}
		return r.isEmpty() ? "Dire" : "Radiant";
	}
}
