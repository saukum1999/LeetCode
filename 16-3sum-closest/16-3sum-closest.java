class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length -1;
        int res = nums[0] + nums[1] + nums[len];
        
        int sum = Integer.MAX_VALUE;
        for(int a = 0; a < nums.length-2; a++){
            int b = a + 1;
            int c = len;
                        
            while(b<c){
                
                sum = nums[a] + nums[b] + nums[c];
                if(sum < target)
                    b++;
                else
                    c--;
                if( Math.abs(sum - target) < Math.abs(res - target))
                    res = sum;
            }
        }
        return res;
        
        
    }
}