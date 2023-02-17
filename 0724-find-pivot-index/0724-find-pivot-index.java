class Solution {
    public int pivotIndex(int[] nums) {
        int[] lsum = new int[nums.length];
        int[] rsum = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length-1; i++){
            sum += nums[i];
            lsum[i+1] = sum;
        }
        sum = 0;
        for(int i = nums.length - 1; i >= 1; i--){
            sum += nums[i];
            rsum[i-1] = sum;
        }

        for(int i = 0; i < nums.length; i++){
            if(lsum[i] == rsum[i])
                return i;
        }
        return -1;
    }
}