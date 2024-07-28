package SpecialPatterns;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows = ");
        int rows = sc.nextInt();
        int number = 1;
        for(int i=1;i<=rows;i++){
            for(int j=0;j<i;j++){
                System.out.print((2*j + 1) + " ");
            }
            System.out.println();
        }
    }
}
