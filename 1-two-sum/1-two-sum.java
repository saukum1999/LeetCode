class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        
        for(int i =0; i<nums.length; i++){
            int count = target - nums[i];
            if(map.containsKey(count)) {
                res[0] = map.get(count);
                res[1] = i;
                return res;
            }
            else
                map.put(nums[i],i);
            
                 
        }
        
        return res;
    }
}




























//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int ar[] = new int [2];
        
//         for(int i=0; i<nums.length; i++){
            
//             int b = target - nums[i];
//             if(map.containsKey(b)){
//                 ar[0] = i;
//                 ar[1] = map.get(b);
//                 return ar;
//             }
//             else{
//                 map.put(nums[i],i);
//             }
//         }
        
//         return ar;
//     }
// }