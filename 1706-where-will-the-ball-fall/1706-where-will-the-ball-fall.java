

class Solution {
    public int[] findBall(int[][] grid) {

        int[] list = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            list[i]=drop(grid,0,i);
        }
        return list;
    }

    public int drop(int[][] grid, int i, int j) {
        if (i == grid.length)
            return j;
        if (j < 0 ||j >= grid[0].length )
            return -1;

        if (grid[i][j] == 1 && j+1<grid[0].length && grid[i][j + 1] == 1 ){
                return drop(grid, i + 1, j + 1);
        } else if (grid[i][j] == -1 && j-1>=0 &&  grid[i][j - 1] == -1){
                return drop(grid, i + 1, j - 1);
        }
        
        return -1;

    }
}