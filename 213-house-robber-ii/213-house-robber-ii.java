class Solution {
    public int rob(int[] nums) {
        
        int len = nums.length;
        if(len == 0)
            return 0;
        else if(len == 1)
            return nums[0];
        else if(len == 2)
            return Math.max(nums[0], nums[1]);
        
        return  Math.max(rober(nums, 0, len-2), rober(nums,1,len-1));
    }
    
    public int rober(int[] nums, int start, int end){
        
        int l = 0, r =0, temp1 = 0, temp2 = 0;
        for(int i = start; i<=end; i++){
            temp1 = temp2;
            temp2 = nums[i] + Math.max(l, r);
            l = r;
            r = temp1;
        }
        
        return Math.max(temp2,temp1);
    }
}