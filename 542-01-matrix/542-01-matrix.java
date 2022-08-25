class Solution {
    public int[][] updateMatrix(int[][] mat) {
        // Queue<int[]> que = new LinkedList<>();
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] res = new int[rows][cols];
        
        int max = rows+cols;
                
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(mat[i][j] == 0)
                    continue;
                res[i][j] = max;
                if( i > 0)
                    res[i][j] = Math.min(res[i][j], res[i-1][j] +1 );
                if( j > 0)
                    res[i][j] = Math.min(res[i][j], res[i][j-1] +1 );
            }
        }
        
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                if (mat[i][j] == 0) {
                    continue;
                }
                if (i < rows - 1) {
                    res[i][j] = Math.min(res[i][j], res[i + 1][j] + 1);
                }
                if (j < cols - 1) {
                    res[i][j] = Math.min(res[i][j], res[i][j + 1] + 1);
                }
            }
        }

        return res;
        
    }
}