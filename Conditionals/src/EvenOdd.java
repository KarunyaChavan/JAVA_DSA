import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number = ");
		int num = sc.nextInt();
		if(num%2==0)
			System.out.println("Given Number is an even number");
		else
			System.out.println("Given Number is an odd number");
	}

}
