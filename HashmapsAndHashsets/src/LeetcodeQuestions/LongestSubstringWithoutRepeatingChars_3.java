//LEETCODE 3
package LeetcodeQuestions;
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChars_3 {
	//USING TWO POINTER APPROACH with SLIDING WINDOW
	public int lengthOfLongestSubstring(String s) {
		if(s.length()<=1) return s.length();
		int n = s.length();
		HashMap<Character, Integer> map = new HashMap<>(); //<char, index>
		int maxlen = 0, i = 0, j = 0, len = 0;
		while(j < n){
			char ch = s.charAt(j);
			if(map.containsKey(ch) && map.get(ch)>=i){
				len = j - i;
				maxlen = Math.max(len, maxlen);
				//get i at 1 ahead of char's old position
				while(s.charAt(i)!=ch) i++;
				i++;
			}
			map.put(ch,j);
			j++;
		}
		len = j - i;
		maxlen = Math.max(len, maxlen);
		return maxlen;
	}
}
