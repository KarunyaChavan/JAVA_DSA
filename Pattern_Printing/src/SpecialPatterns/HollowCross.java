package SpecialPatterns;

import java.util.Scanner;

public class HollowCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows = ");
        int rows = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                if((i==j) || (j==rows-1-i))
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
