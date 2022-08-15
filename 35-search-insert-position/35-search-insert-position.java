class Solution {
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        // int mid = (left + right) / 2;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (target < nums[mid])
                right = mid ;
            else if (target > nums[mid])
                left = mid +1 ;
            
        }
        if(target > nums[left])
        return left+1;
        return left;
            
    }

}