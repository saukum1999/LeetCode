class Solution {
    public  List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> mans = new ArrayList<>();
        boolean[] freq_map = new boolean[nums.length];

        helper_premute(nums,freq_map, mans, ans);

        return ans;

    }

    public  void helper_premute(int[] nums ,boolean[] freq_map, List<Integer> mans, List<List<Integer>> ans){

        if(mans.size() == nums.length){
            ans.add(new ArrayList(mans));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(!freq_map[i]){
                mans.add(nums[i]);
                freq_map[i] = true;
                helper_premute(nums, freq_map, mans, ans);
                mans.remove(mans.size()-1);
                freq_map[i] = false;

            }
        }
    }
}