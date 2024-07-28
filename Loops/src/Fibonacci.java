import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Desired Number - ");
        int num = sc.nextInt();
        int temp = 0,a = 0,b = 1;
        for(int i=1;i<=num;i++){
            temp = a+b;
            a = b;
            b = temp;
            System.out.print(a + " ");
        }
    }
}
