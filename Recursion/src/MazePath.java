import java.util.Scanner;

public class MazePath {
	public static int escapeMaze1(int row, int col, int m, int n){
		// if(row==m || col==n) return 1; shortcut
		if(row==m && col==n) return 1;
		if(row>m || col>n) return 0;
		int right_ways = escapeMaze1(row,col+1,m,n); //moved right;
		int down_ways = escapeMaze1(row+1,col,m,n);
		return right_ways + down_ways;
	}
	public static int escapeMaze(int m, int n){ // Moving from (1,1) is equivalent to vice versa
		if(m==1 || n==1) return 1;
		int right_ways = escapeMaze(m,n-1); //moved right;
		int down_ways = escapeMaze(m-1,n);
		return right_ways + down_ways;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m : ");
		int n = sc.nextInt();
		System.out.print("Enter n : ");
		int m = sc.nextInt();
		System.out.println("Ways tp reach goal : "+escapeMaze(m,n));
	}
}
