class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        if(cost.length < 2)
            return cost[cost.length - 1];
        int len = cost.length;
        int[] min_cost = new int[len];
        min_cost[0] = cost[0];
        min_cost[1] = cost[1];
        
        for(int i = 2; i < len; i++){
            min_cost[i] = cost[i] + Math.min(min_cost[i-1], min_cost[i-2]);
        }
        
        return Math.min(min_cost[len-1], min_cost[len-2]);
    }
}