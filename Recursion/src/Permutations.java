
public class Permutations {
	public static void printPermtations(String ans, String s){
		if(s.length()==0){
			System.out.println(ans);
			return;
		}
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			String left = s.substring(0,i);
			String right = s.substring(i+1);
			printPermtations(ans+ch, left+right);
		}
	}
	public static void main(String[] args) {
		String s = "abc";
		printPermtations("",s);
	}
}
