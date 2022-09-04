class Solution {
    public int jump(int[] nums) {
        int step = Integer.MIN_VALUE;
        int len = nums.length;
        int[] cost = new int[len];
        Arrays.fill(cost, len);
        cost[0] = 0;
        for(int i = 0; i < len; i++){
            for(int j = i+1; j <= i+nums[i] && j<len; j++){
                cost[j] = Math.min(cost[j], cost[i] + 1);
            }                
        }
        
        return cost[len-1];
        
    }
}