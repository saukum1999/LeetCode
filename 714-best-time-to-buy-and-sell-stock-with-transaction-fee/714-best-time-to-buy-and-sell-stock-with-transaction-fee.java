class Solution {
    public int maxProfit(int[] prices, int fees) {
        int len = prices.length;
        int[] prev  = new int[2];
        int[] cur  = new int[2];
        
        for(int i = len - 1; i >= 0; i--){
            for(int buy = 0; buy <= 1; buy++){
                if(buy == 1)
                     cur[buy] = Math.max( -prices[i] + prev[0]
                                                    , 0 + prev[1]);
                 else
                     cur[buy] = Math.max(-fees + prices[i] + prev[1]
                                        , 0 + prev[0]);
            }
            prev = cur;
        }
        return cur[1];
    }
    
}