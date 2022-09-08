class Solution {
    public int maxProfit(int[] prices, int fees) {
        int len = prices.length;
        int[][] dp  = new int[len + 1][2];
        
        for(int i = len - 1; i >= 0; i--){
            for(int buy = 0; buy <= 1; buy++){
                if(buy == 1)
                     dp[i][buy] = Math.max( -prices[i] + dp[i+1][0]
                                                    , 0 + dp[i+1][1]);
                 else
                     dp[i][buy] = Math.max(-fees + prices[i] + dp[i+1][1]
                                        , 0 + dp[i+1][0]);
            }
        }
        return dp[0][1];
    }
    
}