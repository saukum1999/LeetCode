class Solution {
    public int maxProfit(int[] prices) {
        
        int res = 0;
        int l = 0;
        int r = 1;
        for(int i = 1; i < prices.length; i++){
            r = i;
            if(prices[r] < prices[l])
                l = r;
            else
                res = Math.max(res, prices[r] - prices[l]);
        }
        
        return res;
        
    }
}