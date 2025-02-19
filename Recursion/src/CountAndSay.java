import java.util.Scanner;

public class CountAndSay {
	public static String countAndSay(int n) {
		if(n==1) return "1";
		String s = countAndSay(n-1);
		String ans = "";
		int i=0, j=0, len = 0;
		while(j<s.length()){
			if(s.charAt(i)==s.charAt(j)) j++;
			else{
				len = j - i;
				ans += len;
				ans += s.charAt(i);
				i = j;
			}
		}
		len = j - i;
		ans += len;
		ans += s.charAt(i);
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}
}
