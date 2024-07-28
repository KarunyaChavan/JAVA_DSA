import java.util.Scanner;
public class ModMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number = ");
		int num = sc.nextInt();
		if(num<0) {
			num *= -1;
		}
		System.out.println("Absolute Value of given number = " + num);
	}
}
