package Questions;
//Leetcode 58
public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		int i = s.length() - 1;
		while(i>=0 && s.charAt(i)==' '){
			i--;
		}
		int ans = 0;
		while(i>=0 && s.charAt(i)!=' '){
			ans++;
			i--;
		}
		return ans;
	}
	public static void main(String[] args) {
		String s = "I am Karunya";
		System.out.println(lengthOfLastWord(s));
	}
}
