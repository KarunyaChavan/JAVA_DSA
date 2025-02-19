import java.util.Scanner;

//Leetcode 22
//Note : At any point in time, no of closing paras shouldn't exceed no of opening paras
public class GenerateParentheses {
	public static void print(int open, int close, int n, String s){
		if(s.length()==n*2){
			System.out.println(s);
			return;
		}
		if(open < n)
			print(open+1, close, n, s+"(");
		if(close < open) //Makes sure , parentheses are balanced
			print(open, close+1, n, s+")");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of Opening Brackets : ");
		int n = sc.nextInt();
		print(0,0,n,"");
	}
}
