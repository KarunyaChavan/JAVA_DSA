package Questions;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "car";
        String t = "rac";
        if (s.length() != t.length()) System.out.println("Not Anagram");
        else {
            char[] a = s.toCharArray();
            char[] b = t.toCharArray();
            int flag = 0;
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    flag = 1;
                    System.out.println("Not Anagram");
                    break;
                }
            }
            if(flag == 0){
                System.out.println("Its Anagram");
            }
        }
    }
}
