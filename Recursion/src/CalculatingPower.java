public class CalculatingPower {
	public static int pow(int a, int b){ //O(N)
		if(a==0 && b==0) {
			System.out.println("Not Defined");
			return -1;
		}
		if(b==0) return 1;
		return a * pow(a,b-1);
	}
	public static void main(String[] args) {
		int x = 2;
		int y = 7;
		System.out.println(x + "^" + y + " = "+pow(x,y));
	}
}
