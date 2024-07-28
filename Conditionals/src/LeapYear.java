import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter desired year = ");
		int year = sc.nextInt();
		if((year % 400==0) || (year%100!=0) && (year%4==0))
			System.out.println("Given Year is a LEAP YEAR");
		else
			System.out.println("Given Year is NON-LEAP YEAR");
	}

}
