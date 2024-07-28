package CompositePatterns;

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows = ");
        int rows = sc.nextInt();
        for(int i=rows;i>1;i--){
            for(int j=rows;j>=1;j--){
                if(j>i)
                    System.out.print(j + " ");
                else
                    System.out.print(i + " ");
            }
            for(int j=2;j<=rows;j++){
                if(j>i)
                    System.out.print(j + " ");
                else
                    System.out.print(i + " ");
            }
            System.out.println();
        }
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>=1;j--){
                if(j>i)
                    System.out.print(j + " ");
                else
                    System.out.print(i + " ");
            }
            for(int j=2;j<=rows;j++){
                if(j>i)
                    System.out.print(j + " ");
                else
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
