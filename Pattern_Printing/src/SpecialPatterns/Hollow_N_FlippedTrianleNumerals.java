package SpecialPatterns;

import java.util.Scanner;

public class Hollow_N_FlippedTrianleNumerals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows = ");
        int rows = sc.nextInt();
        for(int i=0;i<rows;i++){
            int number = 1;
            for(int j=0;j<rows;j++){
                if((i+j)>=rows || (rows-1-i==j))
                    System.out.print(number++);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
