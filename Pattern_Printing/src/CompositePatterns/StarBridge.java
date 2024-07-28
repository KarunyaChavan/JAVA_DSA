package CompositePatterns;

import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows = ");
        int rows = sc.nextInt();
        for(int i=rows;i>=0;i--){
            for(int j=0;j<i;j++)
                System.out.print("*");
            for(int k=0;k<2*(rows-i);k++)
                System.out.print(" ");
            for(int l=0;l<i;l++)
                System.out.print("*");
            System.out.println();
        }
    }
}
