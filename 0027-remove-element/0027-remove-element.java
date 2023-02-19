class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = nums.length - 1;
        int k = 0;
        while(l <= r){
            if(nums[r] == val){
                r--;
                k++;
            }
            else if(nums[l] == val && nums[r] != val){
                nums[l++] = nums[r--];
                k++;
            }
            else{
                l++;
            }
        }
        return nums.length - k;
    }
}