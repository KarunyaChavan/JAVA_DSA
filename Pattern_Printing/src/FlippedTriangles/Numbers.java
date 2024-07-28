package FlippedTriangles;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows - ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=0;j<rows+1-i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows+1-i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
