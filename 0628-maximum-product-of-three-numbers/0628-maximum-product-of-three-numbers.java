class Solution {
    public int maximumProduct(int[] nums) {
        // Arrays.sort(nums);
        // int l = nums.length - 1;
        // int res1 = nums[l] * nums[l - 1] * nums[l - 2];
        // int res2 = nums[0] * nums[1] * nums[l];

        int mx1 = Integer.MIN_VALUE;
        int mx2 = Integer.MIN_VALUE;
        int mx3 = Integer.MIN_VALUE;
        int mn1 = Integer.MAX_VALUE;
        int mn2 = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > mx3){
                if(nums[i] > mx2){
                    if(nums[i] > mx1){
                        mx3 = mx2;
                        mx2 = mx1;
                        mx1 = nums[i];
                    }
                    else{
                        mx3 = mx2;
                        mx2 = nums[i];
                    }
                }
                else
                    mx3 = nums[i];
            }
            if(nums[i] < mn2){
                if(nums[i] < mn1){
                    mn2 = mn1;
                    mn1 = nums[i];
                }
                else
                    mn2 = nums[i];
            }
        }


        return Math.max(mx1 * mx2 * mx3, mx1 * mn1 * mn2);
        
    }
}