import java.util.Scanner;

public class LeastOfThreeNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 = ");
		int a = sc.nextInt();
		System.out.print("Enter Number 2 = ");
		int b = sc.nextInt();
		System.out.print("Enter Number 3 = ");
		int c = sc.nextInt();
		if(a < b) {
			if(a < c) {
				System.out.println(a + " is least");
			}else {
				System.out.println(c + " is least");
			}
		}else if(b < a) {
			if(b < c) {
				System.out.println(b + " is least");
			}else {
				System.out.println(c + " is least");
			}
		}else if(c < a) {
			if(c < b) {
				System.out.println(c + " is least");
			}else {
				System.out.println(b + " is least");
			}
		}
	}

}
