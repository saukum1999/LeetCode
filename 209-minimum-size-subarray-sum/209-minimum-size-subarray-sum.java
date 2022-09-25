class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;
            
        for(; j < nums.length; j++){
            sum += nums[j];
            while(sum >= target){
                res = Math.min(res, j - i + 1);
                sum -= nums[i];
                i++;
            }
        }
        if(res == Integer.MAX_VALUE)
            return 0;
        return res;
        
    }
}