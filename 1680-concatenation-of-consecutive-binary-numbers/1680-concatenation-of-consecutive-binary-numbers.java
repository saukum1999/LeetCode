class Solution {
    public int concatenatedBinary(int n) {
        long num = 0;
        int len = 0;
        long mod =(long) 1e9+7;
        for(int i = 1; i <= n; i++){
            if((i & (i - 1)) == 0)
                len++;
            num =  ((num << len) + i) % mod;
            
        }
        return (int) num ;
        
    }
    
    
}