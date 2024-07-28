import java.util.Scanner;

class CountAndSquare{
    void countingThenSquaring(int num){
        int count = (num==0)?1:0;
        int temp = num;
        while(temp!=0){
            temp /= 10;
            count++;
        }
        System.out.println("Number of Digits in Given Number = "+ count);
        System.out.println("Square of " + num + " = " + num*num);
    }
}

public class CountAndSquareApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter desired number - ");
        int n = sc.nextInt();
        CountAndSquare cs = new CountAndSquare();
        cs.countingThenSquaring(n);
    }
}
