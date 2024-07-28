package Basic_Operations_of_ArrayList;

import java.util.ArrayList;

public class BasicsOfArraylist {
    public static void main(String[] args) {
        //Declaring an arrayList
        ArrayList<Integer> arrl = new ArrayList<>();
        //Inserting an element into arrayList
        arrl.add(0, 10);
        arrl.add(1, 20);
        arrl.add(2, 30);
        arrl.add(3, 40);
        arrl.add(4, 50);
        arrl.add(5,60);
        System.out.println("Element at 0 index = "+ arrl.get(0));
        //Print whole arraylist
        System.out.println(arrl);
        //Updating an element in arrayList
        arrl.set(2,90);
        System.out.println(arrl);
        System.out.println("Size of ArrayList = "+ arrl.size());
        //Appending an element
        arrl.add(100);
        System.out.println(arrl);
        System.out.println("Size of ArrayList = "+ arrl.size());
        //Deleting an element from the arrayList
        arrl.remove(2);
        System.out.println(arrl);
    }
}
