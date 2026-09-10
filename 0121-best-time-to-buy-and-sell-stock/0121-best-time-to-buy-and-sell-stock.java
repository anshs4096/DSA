class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int buy=prices[0];
        int sell=prices[n-1];
        for(int i=0; i<n; i++){
            buy=Math.min(prices[i],buy);
            sell=prices[i];
            profit=Math.max((sell-buy),profit);
        }
        return profit;
    }
}