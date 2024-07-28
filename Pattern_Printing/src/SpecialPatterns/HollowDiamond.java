package SpecialPatterns;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows = ");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for(int j=i; j<(rows-1);j++) {
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                if(j==0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int k=0;k<i+1;k++){
                if(k==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            for(int j=0; j<i;j++) {
                System.out.print("  ");
            }
            for(int j=i;j<rows;j++){
                if(j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int k=i;k<rows-1;k++){
                if(k==rows-2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
