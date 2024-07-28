import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 = ");
        int a = sc.nextInt();
        System.out.print("Enter Number 2 = ");
        int b = sc.nextInt(),dividend,divisor,remainder;
        if(a > b){
            dividend = a;
            divisor = b;
        }else{
            dividend = b;
            divisor = a;
        }
        while(divisor!=0){
            remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        System.out.println("GCD of " + a + " and " + b + " = " + dividend);
    }
}
