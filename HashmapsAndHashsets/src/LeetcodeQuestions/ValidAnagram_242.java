//LEETCODE 242
package LeetcodeQuestions;
import java.util.HashMap;

public class ValidAnagram_242 {
	//USING FREQUENCY MAP
	public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) return false;
		HashMap<Character, Integer> smap = new HashMap<>();
		for(int i=0;i<s.length();i++){
			if(smap.containsKey(s.charAt(i))){
				smap.put(s.charAt(i), smap.get(s.charAt(i))+1);
			}
			else smap.put(s.charAt(i), 1);
		}
		HashMap<Character, Integer> tmap = new HashMap<>();
		for(int i=0;i<t.length();i++){
			if(tmap.containsKey(t.charAt(i))){
				tmap.put(t.charAt(i), tmap.get(t.charAt(i))+1);
			}
			else tmap.put(t.charAt(i), 1);
		}
		for(char key: smap.keySet()){
			int val1 = smap.get(key);
			if(!tmap.containsKey(key)) return false;
			int val2 = tmap.get(key);
			if(val1!=val2) return false;
		}
		return true;
	}
}
