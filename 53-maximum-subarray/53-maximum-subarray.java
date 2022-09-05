class Solution {
    public int maxSubArray(int[] nums) {
        int mam = Math.min(nums[0],0);
        
        int sum = Math.min(nums[0],0);
        
        for(int i = 0; i < nums.length; i++){
            if(sum + nums[i] < nums[i])
                sum = nums[i];
            else
                sum += nums[i];
            mam = Math.max(mam, sum);
        }
        
        return mam;
        
    }
}