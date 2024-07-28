import java.util.Scanner;

class Squares{
    void squaringNaturalNumbers(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i*i + " , ");
        }
    }
}

public class NaturalNumbersSquare {
    public static void main(String[] args) {
        Squares sq = new Squares();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Desired Range = ");
        int num = sc.nextInt();
        sq.squaringNaturalNumbers(num);
    }
}