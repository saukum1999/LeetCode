class Solution {
    public int maxSubArray(int[] nums) {
        int mam = nums[0];
        
        int sum = 0;
        if(nums.length == 1)
            return nums[0];
        
        for(int i = 0; i < nums.length; i++){
            sum = Math.max(sum + nums[i], nums[i]);
            mam = Math.max(mam, sum);
        }
        
        return mam;
        
    }
}