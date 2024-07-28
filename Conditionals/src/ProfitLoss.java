import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Cost Price = ");
		int cost_price = sc.nextInt();
		System.out.print("Enter Selling Price = ");
		int sell_price = sc.nextInt();
		int transaction = sell_price - cost_price;
		if(transaction > 0) {
			System.out.println("Profit Made!!!");
		}else if(transaction < 0) {
			System.out.println("Loss Faced");
		}else {
			System.out.println("Break-Even");
		}
	}

}
