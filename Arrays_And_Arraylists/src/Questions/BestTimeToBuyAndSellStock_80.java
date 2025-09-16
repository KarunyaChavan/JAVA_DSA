package Questions;

public class BestTimeToBuyAndSellStock_80 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min_buy = prices[0];
        int ans = 0;
        for(int i=1;i<n;i++){
            int profit = prices[i] - min_buy;
            if(profit>ans) ans = profit;
            min_buy = Math.min(min_buy, prices[i]);
        }
        return ans;
    }
}
