class Solution {
    public List<Integer> getRow(int n) {
       
        int[] dp = new int[n+1];
        // List<List<Integer>> res = new ArrayList<>();
        List<Integer> tp = new ArrayList<>();
        
        for(int i = 0; i <= n; i++){
            int[] temp = new int[n+1];
                tp = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    temp[j] = 1;
                    tp.add(1);
                }
                else{
                    temp[j] = dp[j-1] + dp[j];
                    tp.add(temp[j]);
                }
                
            }
            dp = temp;
            // res.add(tp);
        }
        
        return tp;
        
    }
}