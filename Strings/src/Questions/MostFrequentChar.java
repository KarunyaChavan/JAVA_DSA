package Questions;

import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.next();
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[(int)s.charAt(i) - 97]++;
        }
        int maxFreq = -1;
        for(int i=0;i<freq.length;i++){
            maxFreq = Math.max(maxFreq, freq[i]);
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==maxFreq){
                char ch = (char)(i+97);
                System.out.println(ch + " ");
            }
        }
    }
}
