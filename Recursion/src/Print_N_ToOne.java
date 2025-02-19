import java.util.Scanner;

public class Print_N_ToOne {
	public static void printerNtoOne(int n){
		if(n==0) return;
		System.out.println(n);
		printerNtoOne(n-1);
	}
	public static void printerOnetoN(int n){
		if(n==0) return;
		printerOnetoN(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printerOnetoN(n);
	}
}
