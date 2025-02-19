import java.util.Scanner;

//Generate all binary strings of length n without consecutive 1's.
public class BinaryStringWoutConsecutiveOnes {
	public static  void printStrings(String s, int n){
		int m = s.length();
		if(m==n){
			System.out.println(s);
			return;
		}
		if(m==0 || s.charAt(m-1)=='0'){
			printStrings(s+0, n);
			printStrings(s + 1,n);
		}
		else printStrings(s+0,n); //Ensuring no consecutive ones
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of String : ");
		int n = sc.nextInt();
		printStrings("",n);
	}
}
