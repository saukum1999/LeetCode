class Solution {
    public int rob(int[] nums) {
        
        int len = nums.length;
        
        if(len == 0)
            return 0;
        else if(len == 1)
            return nums[0];
        
        int res = 0;
        int[] cost = new int[len];
        cost[0] = nums[0];
        cost[1] = nums[1];
        
        res = Math.max(cost[0], cost[1]);
        
        for(int i = 2; i < len; i++){
            if(i-3 >= 0)
                cost[i] = nums[i] + Math.max(cost[i-3], cost[i-2]);
            else
                cost[i] = nums[i] + cost[i-2];
            res = Math.max(res, cost[i]);
        }
     
        return res;
    }
}