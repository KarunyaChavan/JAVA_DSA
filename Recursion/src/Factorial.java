import java.util.Scanner;

public class Factorial {
	public static int factorial(int n){
		if(n==1 || n==0) return 1;
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value for n : ");
		int fact = factorial(sc.nextInt());
		System.out.println(fact);
	}
}