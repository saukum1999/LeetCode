class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length -1;
        int res = nums[0] + nums[1] + nums[len];
        
        int sum = Integer.MAX_VALUE;
        for(int a = 0; a < nums.length-2; a++){
            // if(a >0 && nums[a] == nums[a-1])
            //     continue;
            int b = a + 1;
            int c = len;
                        
            while(b<c){
                // if(b-a > 1 && nums[b] == nums[b-1]){
                //     b++;
                //     continue;
                // }
                // else if(c < len-2 && nums[c] == nums[c+1]){
                //     c--;
                //     continue;
                // }
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