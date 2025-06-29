package Basics;
import java.util.HashSet;

public class BasicSet {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>(); //hashset is an interface
		//inserting elements, TC = O(1). Inserted in random order and may differ from the order they're inserted in.
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);

		//printing the set
		System.out.println("Set : " + set);

		//size
		System.out.println("Current Size  : " + set.size());

		//membership or search is also O(1)
		System.out.println("Contains 20 ? : " + set.contains(20));
		System.out.println("Contains 50 ? : " + set.contains(50));

		//Removing an element also costs O(1)
		set.remove(20); //if element doesn't exists, it doesn't give an error
		System.out.println("After Removing 20 : " + set);

		//Converting set to an array
		Object[] arr = set.toArray(); //dtypes given is object due to wrapper class while instantiating the object set
		for(Object ele:arr){
			System.out.print(ele + " ");
		}

		//iterating over the set
		for(int ele:set){
			System.out.print(ele + " ");
		}
		System.out.println();

		//clearing all elements in the set
		set.clear();
		System.out.println("After Clearing the Set : " + set);
	}
}