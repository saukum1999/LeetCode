class Solution {
    public int maxSubArray(int[] nums) {
        int res = 0;
        int max = nums[0];

        for(int i = 0; i < nums.length; i++){
            res = Math.max(res + nums[i], nums[i]);
            max = Math.max(res, max);
        }
        return max;
    }
}