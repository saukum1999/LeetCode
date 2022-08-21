class Solution {
    public int search(int[] nums, int target) {

		// find pivot on which array is rotated using custom binary search
        int pivot = findPivot(nums, 0, nums.length-1);
		
		// use inbuilt binary search on two sorted arrays from [0 - pivot] and [pivot-nums.length]
        int index = Arrays.binarySearch(nums, 0, pivot, target);
        if (index >= 0) {
            return index;
        }
        index = Arrays.binarySearch(nums, pivot, nums.length, target);
        if (index >= 0) {
            return index;
        }
        return -1;
    }
    
private int findPivot(int[] nums, int start, int end) {
	while (end >= start) {
		int mid = start + (end-start)/2;
		if (mid > 0 && nums[mid-1] > nums[mid]) {
			return mid;
		}
		if (nums[end] < nums[mid]) {
			start = mid+1;
		} else {
			end = mid-1;
		}
	}

	return start;
}
    
}