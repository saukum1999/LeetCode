class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        for(String a : wordDict){
            set.add(a);
        }
        
        return dictionary(s, set);
        
        
    }
    
    public boolean dictionary(String s, HashSet<String> set){
        int[] dp = new int[s.length()];
        
        
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j <= i; j++){
                String str = s.substring(j, i + 1);
                if(set.contains(str)){
                    if(j > 0)
                        dp[i] += dp[j - 1];
                    else
                        dp[i] += 1;
                }
            }
        }
        
        return dp[dp.length - 1] > 0;
    }
    
    
}