class Solution {
    public int search(int[] nums, int target) {

        int l=0;
        int r=nums.length-1;
        int mid = (l+r)/2;

        if(target > nums[r] || target < nums[l])
            return -1;
        
        while(l<=r){
            if(nums[mid]==target)
                return mid;
            else if (nums[mid]<target)
                l = mid+1;
            else if(nums[mid]>target)
                r = mid-1;
            mid = (l+r)/2;
        }

        return -1;
    }
}