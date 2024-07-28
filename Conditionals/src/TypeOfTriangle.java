import java.util.Scanner;

public class TypeOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Side 1 = ");
		int side1 = sc.nextInt();
		System.out.print("Enter Side 2 = ");
		int side2 = sc.nextInt();
		System.out.print("Enter Side 3 = ");
		int side3 = sc.nextInt();
		if((side1==side2) && (side2==side3))
			System.out.println("It's an Equilateral Triangle");
		else if((side1==side2) || (side1==side3) || (side2==side3))
			System.out.println("It's an Isosceles Triangle");
		else System.out.println("It's a Scalene Triangle");
	}

}
