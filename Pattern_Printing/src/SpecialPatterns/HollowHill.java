package SpecialPatterns;

import java.util.Scanner;

public class HollowHill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows = ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>i;j--){
                System.out.print("  ");
            }
            System.out.print("* ");
            for(int k=1;k<(2*i - 2);k++)
                System.out.print("  ");
            if(i!=1)
                System.out.print("* ");
            System.out.println();
        }
    }
}
