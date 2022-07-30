class Solution {
    public int[] runningSum(int[] nums) {

        if (nums.length > 1) {

            for (int i = 1; i < nums.length; i++) {
                nums[i] = nums[i - 1] + nums[i];
            }
        }
        return nums;
    }
}

// class Solution {
//     public int[] runningSum(int[] nums) {
//         int sum = 0;
//         int[] sol = new int[nums.length];
//         for(int i=0 ; i<nums.length ; i++){
//             sum += nums[i];
//             sol[i] = sum;
//         }
        
//         return sol;
//     }
// }