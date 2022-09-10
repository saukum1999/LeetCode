class Solution {
    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        int[][][] dp = new int [len][2][k];
        
        for(int[][] a : dp){
            for(int[] b : a){
                Arrays.fill(b, -1);
            }
        }
        
        return maxi(prices, 0, 1, k, dp);
        
    }
    
    public int maxi(int[] prices, int i, int buy, int count, int[][][] dp ){
        if(i == prices.length || count == 0)
            return 0;
        
        if(dp[i][buy][count - 1] != -1)
            return dp[i][buy][count - 1];
        
        int profit = 0;
        
        if(buy == 1){
            profit = Math.max( -prices[i] + maxi(prices, i + 1, 0, count, dp)
                             , 0 + maxi(prices, i + 1, 1, count, dp));
        }
        else {
            profit = Math.max( prices[i] + maxi(prices, i + 1, 1, count - 1, dp)
                             , 0 + maxi(prices, i + 1, 0, count, dp));
        }
        dp[i][buy][count - 1] = profit;
        return profit;
    }
}