public class PreInPost {
	//Whenever a recursive function calls itself multiple time then work done in divided as pre, in and post
	public static void pip(int n){
		if(n==0) return;
		System.out.println(n); //pre
		pip(n-1);
		System.out.println(n); // in
		pip(n-1);
		System.out.println(n); // post
	}
	public static void main(String[] args) {
		pip(3);
	}
}
