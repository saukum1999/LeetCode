class Solution {
    public int maxProfit(int[] prices) {
        int cur = 0;
        // int sum = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i-1] < prices[i])
                cur += prices[i] - prices[i - 1];
        }
        return cur;
    }
}