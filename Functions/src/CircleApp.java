import java.util.Scanner;

class Circle{
    double getArea(double r){
        return (3.14 * r);
    }
}

public class CircleApp {
    public static void main(String[] args) {
        Circle c = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle = ");
        int radius = sc.nextInt();
        double area = c.getArea(radius);
        System.out.println("Area of Given Circle = "+ area);
    }
}
