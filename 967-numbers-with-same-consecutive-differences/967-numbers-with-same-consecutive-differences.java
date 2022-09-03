class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> res = new ArrayList<>();
        
        for(int i = 1; i < 10; i++){
            dfs(i, n-1, k, res);
        }
        return res.stream().mapToInt(i->i).toArray();
    }
    
    public void dfs(int num, int n, int k, List<Integer> res){
        if(n == 0){
            res.add(num);
            return;
        }
        
        int prev = num%10;
        if(prev >= k){
            dfs(num*10 + prev - k, n-1, k, res);
        }
        if(k > 0 && prev + k <10){
            dfs(num*10 + prev + k, n-1, k, res);
        }
            
    }
}