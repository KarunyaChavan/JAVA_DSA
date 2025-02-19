public class PowerFunctionLogarithmic {
	public static int pow(int a, int b){ //O(log(b))
		if(a==0 && b==0) {
			System.out.println("Not Defined");
			return -1;
		}
		if(b==0) return 1;
		int ans = pow(a,b/2);
		if(b%2==0) return ans * ans;
		else return ans * ans * a;
	}
	public static void main(String[] args) {
		int x = 2;
		int y = 7;
		System.out.println(x + "^" + y + " = "+pow(x,y));
	}
}
