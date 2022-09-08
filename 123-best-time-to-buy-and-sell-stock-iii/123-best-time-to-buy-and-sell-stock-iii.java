class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[][][] dp = new int[len][2][3];
        
        for(int[][] a : dp){
            for(int[] b : a){
                Arrays.fill(b, -1);
            }
        }
        
        return maxi(0, 1, 2, dp, prices);
        
        
    }
    
    public int maxi(int i, int buy, int c, int[][][] dp, int[] prices){
        if(i == prices.length || c == 0)
            return 0;
        
        if(dp[i][buy][c] != -1)
            return dp[i][buy][c];
        
        int profit = 0;
        if(buy == 1){
            profit = Math.max( -prices[i] + maxi(i + 1, 0, c, dp, prices)
                             , 0 + maxi(i + 1, 1, c, dp, prices));                
        }
        else{
            profit = Math.max( prices[i] + maxi(i + 1, 1, c - 1, dp, prices)
                             , 0 + maxi(i + 1, 0, c, dp, prices));                
        }
        dp[i][buy][c] = profit;
        return profit;
    }
}