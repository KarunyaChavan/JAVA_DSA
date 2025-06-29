package Basics;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSet_And_TreeMap {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();

		//inserting elements
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);

		System.out.print("Current Set :");
		for(int ele: set){
			System.out.print(ele + " "); //sorted
		}
		System.out.println();
		//unlike hashsets and hashmaps, elements are sorted in treeset and treemaps (Ordered)
		//TC = O(logn)

		TreeMap<String, Integer> map = new TreeMap<>();

		//inserting elements into map
		map.put("KC", 31013);
		map.put("PM", 31043);
		map.put("TA", 31004);

		for(String key: map.keySet()){
			System.out.println(key + " --> " + map.get(key)); //sorted by keys
		}
	}
}
