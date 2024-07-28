package CompositePatterns;

import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows = ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=i;j<rows;j++){
                System.out.print("  ");
            }
            for(int k=0;k<(2*i-1);k++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=1;i<=rows;i++){
            for(int k=1;k<=i;k++)
                System.out.print("  ");
            for(int j=2*(rows-i-1);j>=0;j--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
