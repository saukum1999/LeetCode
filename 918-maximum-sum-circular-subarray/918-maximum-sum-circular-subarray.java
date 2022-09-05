class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int len = nums.length ;
        int curMax = 0;
        int curMin = 0;
        int minimum = nums[0];
        int maximum = nums[0];
        int sum = 0;
        if(nums.length == 1)
            return nums[0];
        
        for(int i = 0; i < len; i++){            
            sum += nums[i];            
//             maximum
            curMax = Math.max(curMax + nums[i], nums[i]);
            maximum = Math.max(curMax, maximum);            
//             minimum
            curMin = Math.min(curMin + nums[i], nums[i]);
            minimum = Math.min(curMin, minimum);
        }
        if(sum == minimum)
            return maximum;        
        return Math.max(sum - minimum, maximum);
    }
}