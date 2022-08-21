class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int height = matrix.length;
        int len = matrix[0].length;
        
        for(int i = 0; i < height; i++){
            if(target<=matrix[i][len-1]){
                for(int j = 0; j < len; j++){
                    if(matrix[i][j] == target)
                        return true;
                }
            }
        }
        
        return false;
        
    }
}