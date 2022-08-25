class Solution {
    public int orangesRotting(int[][] g) {
        
        Queue<int[]> que = new LinkedList<>();
        int days = 0;
        int fresh = 0;
        int f_r = 0;
        int rows = g.length;
        int cols = g[0].length;
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(g[i][j] == 2){
                    que.offer(new int[]{i,j});
                }
                if(g[i][j] != 0)
                    fresh++;
            }
        }
        
        
        if(fresh == 0)
            return 0;
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        while(!que.isEmpty()){
            int size = que.size();
            f_r += size;
            for(int i = 0; i < size; i++){
                int[] pos = que.poll();
                for(int j = 0; j < 4; j++){
                    int x = pos[0] + dx[j];
                    int y = pos[1] + dy[j];
                    
                    if( x < 0 || x >= rows || y < 0 || y >= cols || g[x][y] == 2 || g[x][y] == 0)
                        continue;
                    
                    g[x][y] = 2;
                    que.offer(new int[]{x,y});
                }
                
                
            }
            if(que.size() != 0)
                    days++;
            
        }
        
        if( f_r == fresh)
            return days;
        return -1;
        
    }
}