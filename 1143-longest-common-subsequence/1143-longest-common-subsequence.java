class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int l1 = text1.length();
        int l2 = text2.length();
        Integer[][] dp = new Integer[l1 + 1][l2 + 1];
        
        return helper(l1, l2, dp, text1, text2);
        
        
    }
    
    public int helper(int i1, int i2, Integer[][] dp, String s1, String s2){
        if(i1 == 0 || i2 == 0)
            return 0;
        
        if(dp[i1][i2] != null)
            return dp[i1][i2];
        
        if(s1.charAt(i1 - 1) == s2.charAt(i2 - 1))
            dp[i1][i2] = 1 + helper(i1 - 1, i2 - 1, dp, s1, s2);
        else
            dp[i1][i2] = Math.max(helper(i1 - 1, i2, dp, s1, s2), helper(i1, i2 - 1, dp, s1, s2));
        return dp[i1][i2];
    }
}