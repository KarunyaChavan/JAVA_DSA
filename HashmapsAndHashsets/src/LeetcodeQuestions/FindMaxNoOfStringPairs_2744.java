package LeetcodeQuestions;
import java.util.HashSet;

public class FindMaxNoOfStringPairs_2744 {
	public String reverse(String s){
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	public int maximumNumberOfStringPairs(String[] words) {
		HashSet<String> set = new HashSet<>();
		int count = 0;
		for(int i=0;i<words.length;i++){
			String rev = reverse(words[i]);
			if(set.contains(rev)) {
				count++;
				set.remove(rev); //it ensures, that code works even when the array consists of duplicate strings
			}
			else set.add(words[i]);
		}
		return count;
	}
}
