//LEETCODE 2483
package LeetcodeQuestions;

public class MinimumPenaltyForShop_2483 {
	public int bestClosingTime(String customers) {
		int n = customers.length();
		int[] pre = new int[n+1];
		for(int i=1;i<=n;i++){
			pre[i] = pre[i-1];
			if(customers.charAt(i-1)=='N') pre[i] += 1;
		}
		int[] suff = new int[n+1];
		for(int i=n-1;i>=0;i--){
			suff[i] = suff[i+1];
			if(customers.charAt(i)=='Y') suff[i] += 1;
		}
		int min = Integer.MAX_VALUE;
		for(int i=0;i<=n;i++){
			pre[i] += suff[i];
			min = Math.min(min, pre[i]);
		}
		for(int i=0;i<=n;i++){
			if(pre[i]==min) return i;
		}
		return 7777; //it will never reach
	}
}
