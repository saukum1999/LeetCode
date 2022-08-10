class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int len = cost.length;
        
        int a = cost[0];
        int b = cost[1];
        // int[] res = new int[len];
        
        for(int i=2 ; i<len;i++){
            int cur =  cost[i] + Math.min(a, b);
            a = b;
            b = cur;
        }
        
        return Math.min(a,b);
    }
}