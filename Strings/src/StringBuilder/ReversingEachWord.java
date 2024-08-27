package StringBuilder;

import java.util.Scanner;

public class ReversingEachWord {
    private static void reverse(StringBuilder s, int i, int j){
        while(i<=j){
            char temp = s.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,temp);
            i++; j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int n = str.length();
        int i=0,j=0;
        while(j<n){
            if(str.charAt(j) == ' '){
                reverse(str,i,j-1);
                i = j+1;
            }
            j++;
        }
        reverse(str,i,j-1);
        System.out.println("Reversed : "+ str);
    }
}
