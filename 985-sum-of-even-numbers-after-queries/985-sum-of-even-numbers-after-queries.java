class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] que) {
        int l = nums.length;
        int s = 0;
        for(int a : nums){
            if(a % 2 == 0)
                s += a;
        }
        int[] res = new int[l];
        
        for(int i = 0; i < l; i++){
            int val = que[i][0];
            int ind = que[i][1];
            
            if(nums[ind] % 2 == 0){
                s -= nums[ind];
            }
            nums[ind] += val;
            if((nums[ind]) % 2 == 0 )
                s += nums[ind];
            res[i] = s;
        }
        
        return res;
        
    }
    
    // public int sum_ar(int[] nums){
    //     int res = 0;
    //     for(int i = 0; i < nums.length; i++){
    //         if(nums[i] % 2 == 0)
    //         res += nums[i];
    //     }
    //     return res;
    // }
}