class Solution {
    public int maxProfit(int[] prices) {
        int cost=0;
        int profit=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            cost=prices[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(prices[i],min);
        }
        return profit;
    }
}
