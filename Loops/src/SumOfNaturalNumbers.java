import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.print("Enter Desried Range = ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int result = 0;
        for(int i=1;i<=range;i++){
            result += i;
        }
        System.out.println("Sum of Natural Numbers upto " + range + " = " + result);
    }
}
