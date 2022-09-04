class Solution {
    public boolean canJump(int[] nums) {
        
        int len = nums.length;
        if(len <= 1)
            return true; 
        int m = Integer.MIN_VALUE;
        int[] pos = new int[len];
        
        for(int i = 0; i < len; i++){
            if(nums[i] == 0 && m <= i)
                return false;
            
            pos[i] = i + nums[i];
            m = Math.max(m, pos[i]);
            if(pos[i] >= len - 1)
                return true;
        }
        
        return false;
    }
}