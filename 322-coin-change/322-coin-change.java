class Solution {
//     public int coinChange(int[] coins, int amount) {
//         Arrays.sort(coins);
        
//         int[] dp = new int[amount+1];
//         dp[0] = 1;
        
//         for(int i = 0; i < coins.length; i++){
//             for(int j = coins[i]; j < dp.length; j++){
//                 if(dp[j- coins[i]] > 0)
//                 dp[j] += dp[j - coins[i]];            
//             }
                
//         }
        
//         for(int i = 0; i<dp.length; i++)
//             System.out.println(dp[i]);
        
//         if(dp[amount] == 0)
//             return -1;
//         return dp[dp.length-1];
//     }
    
    public int coinChange(int[] coins, int amount) {
       int[] dp = new int[amount + 1];
       Arrays.fill(dp, amount + 1); 
       dp[0] = 0; 
       for(int j = 0; j < coins.length; j++){
         for(int i = 0; i <= amount; i++){
           if(i - coins[j] >= 0) dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1); 
         } 
       } 
       return dp[amount] > amount ? -1 : dp[amount];
    }
    
    
}