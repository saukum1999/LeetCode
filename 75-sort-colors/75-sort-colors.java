class Solution {
    public void sortColors(int[] nums) {
        
        int i = 0;
        int k = 0;
        int j = nums.length - 1;
        
        while(i <= j){
            if(nums[i] == 0){
               nums[i] = nums[k];
                nums[k] = 0;
                k++;
                // i--;
            }
            else if(nums[i] == 2){
                nums[i] = nums[j];
                nums[j] = 2;
                j--;
                i--;
            }
            i++;
        }
        
    }
}
