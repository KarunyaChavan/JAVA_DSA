package Basics;
import java.util.HashMap;

public class BasicMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		//inserting elements
		map.put("KC", 31013);
		map.put("PM", 31043);
		map.put("TA", 31004);
		//when we insert same keys with different values, its over-ridden
		map.put("KC",31001);
		map.put("SG",31027);

		//printing elements
		System.out.println("Map : " + map);
		//size
		System.out.println("Current Size of Map : " + map.size());

		//membership
		System.out.println("Contains PM ? : " + map.containsKey("PM"));

		//removing elements
		map.remove("SG");
		System.out.println("Map After Removing SG : " + map);

		//accessing the elements in the map
		System.out.println("Value of TA : " + map.get("TA"));
		System.out.println("All Keys in Map : " + map.keySet());

		//Iterating in Map
		System.out.println("Iterating in the map");
		for(String key: map.keySet()){
			System.out.println(key + " ---> " + map.get(key));
		}
		System.out.println();
		//for printing only values
		System.out.println("Values of keys in the map");
		for(int val: map.values()){
			System.out.println(val);
		}
		//using entry set
		System.out.println("Using Entry Set");
		for(Object pair: map.entrySet()){
			System.out.println(pair);
		}
	}
}
