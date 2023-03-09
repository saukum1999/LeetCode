class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int[] r_max = new int[grid.length];
        int[] c_max = new int[grid[0].length];
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                r_max[i] = Math.max(r_max[i], grid[i][j]);
                c_max[i] = Math.max(c_max[i], grid[j][i]);
            }
        }

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(Math.min(r_max[i], c_max[j]) > grid[i][j]){
                    res += Math.min(r_max[i], c_max[j]) - grid[i][j];
                }
            }
        }
        return res;

    }
}