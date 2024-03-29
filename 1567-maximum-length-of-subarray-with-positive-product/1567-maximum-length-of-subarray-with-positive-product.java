class Solution {
    public int getMaxLen(int[] nums) {
        int positive = 0;
        int negative = 0;
        int res = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                positive = 0;
                negative = 0;
            }
            else if(nums[i] > 0){
                positive++;
                negative = negative == 0 ? 0 : negative+1;
            }   
            else {
                int temp = positive;
                positive = negative == 0? 0: negative + 1;
                negative = temp +1;
            }            
            res = Math.max(res, positive);
        }
    return res;
    }
}
