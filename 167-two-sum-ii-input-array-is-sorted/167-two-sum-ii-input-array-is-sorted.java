class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];

        for(int i=0; i<nums.length; i++){
            
            if(  map.containsKey(target - nums[i])){
                res[0] = map.get(target - nums[i])+1;
                res[1] = i+1;
                return res;
            }
            else if(map.isEmpty())
                map.put(nums[i], i);
            else
                map.put(nums[i], i);
                
        }
        return res;
    }
}