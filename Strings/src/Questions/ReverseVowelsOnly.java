package Questions;
//Leetcode 345
public class ReverseVowelsOnly {
	public static boolean isVowel(char s){
		if(s=='A'|| s=='E' || s=='I' || s=='O' || s=='U' || s=='a'|| s=='e' || s=='i' || s=='o' || s=='u') return true;
		return false;
	}


	public static String reverseVowels(String s) {
		int i = 0, j = s.length() - 1;
		char[] chars = s.toCharArray();
		while (i < j) {
			while (i < j && !isVowel(chars[i])) {
				i++;
			}
			while (i < j && !isVowel(chars[j])) {
				j--;
			}
			char temp = chars[j];
			chars[j--] = chars[i];
			chars[i++] = temp;
		}
		return new String(chars);
	}
	public static void main(String[] args) {
		String s = "IceCreAm";
		System.out.println(reverseVowels(s));
	}
}
