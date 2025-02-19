import java.util.Scanner;

public class PrintSumFromOneToN {
	public static int adder(int n){
		if(n==0) return 0;
		return n + adder(n-1);
	}
	public static void sum(int n, int s){
		if(n==0){
			System.out.println(s);
			return;
		}
		sum(n-1,s+n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(adder(10));
		sum(10,0);
	}
}
