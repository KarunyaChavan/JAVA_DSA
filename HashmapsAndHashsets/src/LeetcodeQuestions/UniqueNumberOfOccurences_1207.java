package LeetcodeQuestions;
import java.util.HashSet;
import java.util.HashMap;

public class UniqueNumberOfOccurences_1207 {
	public boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int ele:arr){
			if(map.containsKey(ele)){
				map.put(ele, map.get(ele) + 1);
			}
			else map.put(ele, 1);
		}
		HashSet<Integer> set = new HashSet<>();
		for(int key: map.keySet()){
			int val = map.get(key);
			set.add(val);
		}
		return map.size()==set.size();
	}
}
