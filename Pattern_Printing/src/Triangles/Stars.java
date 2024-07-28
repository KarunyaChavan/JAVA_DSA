package Triangles;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows - ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
