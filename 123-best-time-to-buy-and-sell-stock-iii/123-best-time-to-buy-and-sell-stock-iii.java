class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[][][] dp = new int[len + 1][2][3];
        
//         for(int i = 0; i < len; i++){
//             for(int j = 0; j < 2; j++)
//                 dp[i][j][0] = 0;
//         }
        
//         for(int i = 0; i < 2; i++){
//             for(int j = 0; j < 3; j++)
//                 dp[len][i][j] = 0;
        // }

        for (int i = len - 1; i >= 0; i--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int c = 2; c > 0; c--) {
                    int profit = 0;
                    if (buy == 1) {
                        profit = Math.max(-prices[i] + dp[i + 1][0][c], 0 + dp[i + 1][1][c]);
                    } else {
                        profit = Math.max(prices[i] + dp[i + 1][1][c - 1], 0 + dp[i + 1][0][c]);
                    }
                    dp[i][buy][c] = profit;
                }
            }
        }

        return dp[0][1][2];

    }

}