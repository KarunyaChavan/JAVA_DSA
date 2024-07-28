package CompositePatterns;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows = ");
        int rows = sc.nextInt();
        int spaces = 2*rows - 1;
        int stars = 0;
        for(int i=1;i<=(2*rows - 1);i++){
            if(i<=rows){
                spaces -= 2;
                stars++;
            }
            else{
                spaces += 2;
                stars--;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=stars;j++){
                if(j!=rows)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
