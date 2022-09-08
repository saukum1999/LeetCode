class Solution {
    public int maxProfit(int[] prices) {
        
        int res = 0;
        int l = prices[0];
        for(int i = 1; i < prices.length; i++){
            res = Math.max(res, prices[i] - l);
            l = Math.min(l, prices[i]);
        }
        
        return res;
        
    }
}