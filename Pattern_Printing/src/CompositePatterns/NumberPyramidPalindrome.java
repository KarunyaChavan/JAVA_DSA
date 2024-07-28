package CompositePatterns;

import java.util.Scanner;

public class NumberPyramidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows = ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
                System.out.print(k);
            for(int l=(i-1);l>=1;l--)
                System.out.print(l);
            System.out.println();
        }
    }
}
