import java.util.Arrays;

public class SortingString {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("karunya");
        char[] ch = s.toString().toCharArray();
        System.out.print("Unsorted Array : ");
        for(char ele: ch){
            System.out.print(ele);
        }
        System.out.println();
        System.out.print("Sorted Array : ");
        Arrays.sort(ch);
        for(char ele: ch){
            System.out.print(ele);
        }
    }
}
