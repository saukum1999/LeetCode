class Solution {
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        return count(0,0,m,n,dp);
    }
    public int count(int i, int j, int m, int n, int[][] dp){
        if(i>=m || j>=n )
            return 0;
        else if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j]!=0)
            return dp[i][j];
        else{
            dp[i][j] = (count(i+1,j,m,n,dp)+count(i,j+1,m,n,dp));
            return dp[i][j];
        }
    }
}