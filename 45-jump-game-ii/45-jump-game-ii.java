class Solution {
    public int jump(int[] nums) {
        
        if(nums.length == 1)
            return 0;
        int level = 0;
        int farthest = 0;
        int curMax = 0;
        int i = 0;
        
        while(i <= curMax){
            farthest = curMax;
            for( ; i <= curMax; i++){
                farthest = Math.max(farthest, i + nums[i]);
                if(farthest >= nums.length - 1)
                    return level + 1;
            }
            level++;
            curMax = farthest;
        }
        
        return -1;
    }
}
//         int step = Integer.MIN_VALUE;
//         int len = nums.length;
//         int[] cost = new int[len];
//         Arrays.fill(cost, len);
//         cost[0] = 0;
//         for(int i = 0; i < len; i++){
//             for(int j = i+1; j <= i+nums[i] && j<len; j++){
//                 cost[j] = Math.min(cost[j], cost[i] + 1);
//             }                
//         }
        
//         return cost[len-1];