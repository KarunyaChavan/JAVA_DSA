package CompositePatterns;

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows = ");
        int rows = sc.nextInt();
        for(int i=1;i<=(2*rows-1);i++)
            System.out.print(i);
        System.out.println();
        for(int i=rows;i>=0;i--){
            int num = 1;
            for(int j=1;j<i;j++)
                System.out.print(num++);
            for(int k=0;k<=2*(rows-i);k++) {
                System.out.print(" ");
                num++;
            }
            for(int l=1;l<i;l++)
                System.out.print(num++);
            System.out.println();
        }
    }
}
