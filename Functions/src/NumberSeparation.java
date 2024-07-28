import java.util.Scanner;

class Odd{
    void getAllOddBetween(int a, int b){
        for(int i=a;i<=b;i++){
            if(i%2!=0)
                System.out.print(i + "  ");
        }
    }
}

public class NumberSeparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Odd obj = new Odd();
        System.out.print("Enter start = ");
        int x = sc.nextInt();
        System.out.print("Enter end = ");
        int y = sc.nextInt();
        System.out.print("Odd Numbers between provided range = " );
        obj.getAllOddBetween(x,y);
    }
}
