class Solution {
    public void moveZeroes(int[] nums) {
    
        while(true){
            boolean flag = true;
            for(int i=0; i<nums.length;i++)
            if(i+1 < nums.length && nums[i] == 0 && nums[i+1] != 0)
                flag = swap(nums, i);

            if(flag)
                break;
        }
        
    }
    
    public boolean swap(int[] nums, int i){
        
        if(i+1 < nums.length){
        int temp  = nums[i];
        nums[i] = nums[i+1];
        nums[i+1] = temp;
        }
        return false;
    }
}