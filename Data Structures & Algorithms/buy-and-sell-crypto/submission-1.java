class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int cur_price = prices[0];
        int max_profit = 0;
        for(int i=1; i<n; i++)
        {
            int curr_profit = prices[i]-cur_price;
            if(curr_profit > max_profit)
            {
                max_profit = curr_profit;
            }
            if(prices[i] < cur_price)
            {
                cur_price = prices[i];
            }
        }
        return max_profit;
    }
}