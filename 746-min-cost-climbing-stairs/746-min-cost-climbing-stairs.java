class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int len = cost.length;
        int[] res = new int[len];
        
        for(int i=0 ; i<len;i++){
            if(i<2)
            res[i] = cost[i];
            else
                res[i] = cost[i] + Math.min(res[i-1], res[i-2]);
        }
        
        return Math.min(res[len-1],res[len-2]);
    }
}