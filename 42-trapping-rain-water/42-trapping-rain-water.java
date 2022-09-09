class Solution {
    public int trap(int[] height) {
        
        int l = 0;
        int r = height.length - 1;
        int rmax = 0;
            // Integer.MIN_VALUE;
        int lmax = 0;
            // Integer.MIN_VALUE;
        
        int res = 0;
        
        while(l <= r){
            if(lmax <= rmax){
                if(height[l] >= lmax)
                    lmax = height[l];
                else if(height[l] < lmax){
                    res += lmax - height[l];
                }
                l++;
            }
            
            
            else if(lmax >= rmax) {
                if(height[r] >= rmax)
                    rmax = height[r];
                else if(height[r] < rmax){
                    res += rmax - height[r];
                }
                r--;
            }
        }
        
        return res;
    }
}