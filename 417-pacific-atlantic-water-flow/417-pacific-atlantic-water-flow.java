class Solution {
    private int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        if(heights == null || heights.length == 0 || heights[0].length == 0)
            return res;
        
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];
        
        // dfs
        for(int i = 0; i < rows; i++){
            dfs(heights, i, 0, Integer.MIN_VALUE, pacific);
            dfs(heights, i, cols-1, Integer.MIN_VALUE, atlantic);
        }
        
        for(int i = 0; i < cols; i++){
            dfs(heights, 0, i, Integer.MIN_VALUE, pacific);
            dfs(heights, rows-1, i, Integer.MIN_VALUE, atlantic);
        }
        
        // result prep
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(pacific[i][j] && atlantic[i][j])
                    res.add(Arrays.asList(i,j));
            }
        }
        
        return res;
    }
    
    public void dfs (int[][] matrix, int i, int j, int prev, boolean[][] ocean){
        if(i < 0 || i>=matrix.length || j < 0 || j>=matrix[0].length) return;
        if(matrix[i][j] < prev || ocean[i][j]) return;
        
        ocean[i][j] = true;
        
        for(int[] d : dir ){
            dfs(matrix, i+d[0], j+d[1], matrix[i][j], ocean);
        }
    }
}