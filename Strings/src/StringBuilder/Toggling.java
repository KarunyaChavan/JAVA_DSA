package StringBuilder;

import java.util.Scanner;

public class Toggling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=65 && ascii<=90){
                ascii += 32;
                ch = (char)ascii;
            }else{
                ascii -= 32;
                ch = (char)ascii;
            }
            str.setCharAt(i,ch);
        }
        System.out.println("Toggled : " + str);
    }
}
