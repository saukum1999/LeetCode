class Solution {
    public int maxAreaOfIsland(int[][] grid) {
    
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        int res = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    count = dfs(grid, visited, i, j, 0);
                    res = Math.max(res, count);
                    visited[i][j] = true;
                }
            }
        }
        
        return res;
    }
    
    public int dfs ( int[][] grid, boolean[][] visited, int i,int j, int count){
        if( i<0 || i>=grid.length || j<0 || j>=grid[0].length || visited[i][j])
            return count;
        else if(grid[i][j] == 0)
            return count;
        
        visited[i][j] = true;
        count++;
        count = dfs(grid, visited, i, j+1, count);
        count = dfs(grid, visited, i+1, j, count);
        count = dfs(grid, visited, i-1, j, count);
        count = dfs(grid, visited, i, j-1, count);
        
        return count;
    }
    
    
}