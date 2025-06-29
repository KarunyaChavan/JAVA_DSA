package LeetcodeQuestions;
import java.util.*;

public class Unique3LengthPalindromicSequences_1930 {
	public int countPalindromicSubsequence(String s) {
		HashMap<Character, Integer> first_occurence = new HashMap<>();
		HashMap<Character, Integer> last_occurence = new HashMap<>();
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(!first_occurence.containsKey(ch)) first_occurence.put(ch, i);
			last_occurence.put(ch, i);
		}
		int count = 0;
		for(char ch : first_occurence.keySet()){
			int first_idx = first_occurence.get(ch);
			int last_idx = last_occurence.get(ch);
			HashSet<Character> set = new HashSet<>();
			for(int i=first_idx+1;i<=last_idx-1;i++){
				set.add(s.charAt(i));
			}
			count += set.size();
		}
		return count;
	}
}
