class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length + 1][2];
        
        // for(int[] a : dp){
        //     Arrays.fill(a, -1);
        // }
        int len = prices.length;
        int[] ahead = {0,0};
        int[] cur = {0,0};
        // dp[len][0] = 0;
        // dp[len][1] = 0;
        
        for(int i = len - 1; i >= 0; i--){
            for(int buy = 0; buy <= 1; buy++){
                int profit = 0;
                if(buy == 1){
                    profit = Math.max( -prices[i] + ahead[0]
                                      , 0 + ahead[1]);
                }
                else if(buy == 0) {
                    profit = Math.max(prices[i] +  ahead[1]
                                     , 0 +  ahead[0]);
                }
                cur[buy] = profit;
            }
            ahead = cur;
        }
        
       return cur[1];
    }
}






// memoization

// class Solution {
//     public int maxProfit(int[] prices) {
//         int[][] dp = new int[prices.length][2];
        
//         for(int[] a : dp){
//             Arrays.fill(a, -1);
//         }
//        return maximize(0, 1, prices, dp);
//     }
    
//     public int maximize(int i, int buy, int[] prices, int[][] dp){
//         if(i == prices.length)
//             return 0;
//         int profit = 0;
//         if(dp[i][buy] != -1)
//             return dp[i][buy];
//         if(buy == 1){
//             profit = Math.max( -prices[i] + maximize(i + 1, 0, prices, dp)
//                               , 0 + maximize(i + 1, 1, prices, dp));
//         }
//         else if(buy == 0) {
//             profit = Math.max(prices[i] + maximize(i + 1, 1, prices, dp)
//                              , 0 + maximize(i + 1, 0, prices, dp));
//         }
//         dp[i][buy] = profit;
//         return profit;
            
//     }
// }















// class Solution {
//     public int maxProfit(int[] prices) {
//         int cur = 0;
//         for(int i = 1; i < prices.length; i++){
//             if(prices[i-1] < prices[i])
//                 cur += prices[i] - prices[i - 1];
//         }
//         return cur;
//     }
// }