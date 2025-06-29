package LeetcodeQuestions;
import java.util.HashMap;

public class CheckIfArrayPairsDivisibleByK_1497 {
	public boolean canArrange(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			//for handling negative numbers
			// -a % b = - [a%b] and in order to make it positive we did -n = -n + k ==> p
			int ele = arr[i]%k;
			if(ele < 0) ele += k;

			if(map.containsKey(ele)){
				int freq = map.get(ele);
				map.put(ele, freq+1);
			}
			else map.put(ele,1);
		}
		//0 will conflict as they will return false even when the pair exists
		if(map.containsKey(0)){
			if(map.get(0)%2!=0) return false;
			map.remove(0);
		}
		if(k%2==0 && map.containsKey(k/2)){
			if(map.get(k/2)%2!=0) return false;
			map.remove(k/2);
		}

		for(int key:map.keySet()){
			int rem = k - key;
			if(!map.containsKey(rem)) return false;
			int key_freq = map.get(key);
			int rem_freq = map.get(rem);
			if(key_freq!=rem_freq) return false;
		}
		return true;
	}
}
