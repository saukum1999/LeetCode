class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        if(nums.length == 1)
            return nums[0];
        
        while(j < nums.length){
            if(nums[i] == nums[j])
                j++;
            else{
                i++;
                nums[i] = nums[j];
            }
        }
        return ++i;
    }
}