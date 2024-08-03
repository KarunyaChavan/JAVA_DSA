package ArrayList_2D;
import java.util.*;

public class ArrayListIntroSTL {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c = new ArrayList<>();
        c.add(70);
        //2D List can be referred as list of lists.
        List<List<Integer >> grid = new ArrayList<>();
        grid.add(a); grid.add(b); grid.add(c);
        //System.out.println(grid);
        for(int i=0;i<grid.size();i++){
            //Note the way we're getting the column size
            for(int j = 0; j< grid.get(i).size(); j++){
                System.out.print(grid.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
