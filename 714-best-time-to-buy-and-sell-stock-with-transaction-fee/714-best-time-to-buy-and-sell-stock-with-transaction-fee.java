class Solution {
    public int maxProfit(int[] prices, int fees) {
        int len = prices.length;
        int[][] dp  = new int[len][2];
        
        for(int[] a : dp)
            Arrays.fill(a, -1);
        
        return maxi(0, 1, dp, prices, fees);
    }
    
    public int maxi(int i, int buy, int[][] dp, int[] prices, int fees){
        if(i >= prices.length)
            return 0;
        if(dp[i][buy] != -1)
            return dp[i][buy];
        
        if(buy == 1)
            return dp[i][buy] = Math.max( -prices[i] + maxi(i + 1, 0, dp, prices, fees)
                                            , 0 + maxi(i + 1, 1, dp, prices, fees));
        return dp[i][buy] = Math.max(-fees + prices[i] + maxi(i + 1, 1, dp, prices, fees)
                                        , 0 + maxi(i + 1, 0, dp, prices, fees));
        
    }
}