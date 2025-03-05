package Questions;
//Leetcode 28
public class SubstringFirstOccurence {
	public static int strStr(String haystack, String needle) {
		int n = needle.length();
		if(haystack.equals(needle)) return 0;
		if(haystack.length() < n) return -1;
		for(int i=0;i<=(haystack.length() - n);i++){
			if(haystack.substring(i,i+n).equals(needle)){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String s = "sadbutsad";
		System.out.println(strStr(s,"but"));
	}
}
