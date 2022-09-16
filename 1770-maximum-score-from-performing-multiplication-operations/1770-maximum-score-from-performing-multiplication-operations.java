class Solution {
    public int helper(int[] nums, int[] M, int i, int s, Integer[][] dp) {
        if (i == M.length)
            return 0;
        
        int n = nums.length - 1;
        if ( dp[i][s] != null)
            return dp[i][s];

        int a = M[i] * nums[s] + helper(nums, M, i + 1, s + 1,dp);
        int b = M[i] * nums[n - (i - s)] + helper(nums, M, i + 1, s,dp);

        return dp[i][s] = Math.max(a, b);
    }

    public int maximumScore(int[] nums, int[] multipliers) {
        Integer[][] dp = new Integer[nums.length ][multipliers.length ];

        return helper(nums, multipliers, 0, 0, dp);
    }
} 