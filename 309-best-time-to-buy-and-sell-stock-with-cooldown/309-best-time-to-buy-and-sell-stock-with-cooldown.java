class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[][] dp  = new int[len][2];
        
        for(int[] a : dp)
            Arrays.fill(a, -1);
        
        return maxi(0, 1, dp, prices);
    }
    
    public int maxi(int i, int buy, int[][] dp, int[] prices){
        if(i >= prices.length)
            return 0;
        if(dp[i][buy] != -1)
            return dp[i][buy];
        
        if(buy == 1)
            return dp[i][buy] = Math.max( -prices[i] + maxi(i + 1, 0, dp, prices)
                                            , 0 + maxi(i + 1, 1, dp, prices));
        return dp[i][buy] = Math.max(prices[i] + maxi(i + 2, 1, dp, prices)
                                        , 0 + maxi(i + 1, 0, dp, prices));
        
    }
}