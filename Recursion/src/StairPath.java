import java.util.Scanner;

public class StairPath {
	public static int climbStairs(int n){ //Similar to Fibonacci
		if(n<=2) return n;
		return climbStairs(n-1) + climbStairs(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total Number of Stairs : ");
		int n = sc.nextInt();
		System.out.println("Ways to Climb "+n+" stairs (1/2 allowed at time) : "+climbStairs(n));
	}
}
