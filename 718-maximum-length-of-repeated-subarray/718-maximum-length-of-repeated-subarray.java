class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int res = Integer.MIN_VALUE;
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[][] dp = new int[l1 + 1][l2 + 1];
        
        for(int i = 0; i <= l1; i++)
            dp[i][0] = 0;
        for(int i = 0; i <= l2; i++)
            dp[0][i] = 0;
        
        for(int i = 1; i <= l1; i++){
            for(int j = 1; j <= l2; j++){
                if(nums1[i - 1] == nums2[j - 1])
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = 0;
                res = Math.max(res, dp[i][j]);
            }
        }
        
        return res;
    }
}