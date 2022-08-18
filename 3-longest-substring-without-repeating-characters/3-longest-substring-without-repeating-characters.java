class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0)
            return 0;
        
        int res = 0;
        int len = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        for(;i<len;i++){
            char c = s.charAt(i);
            if(map.containsKey(c))
                j = Math.max(j,map.get(c)+1);
            map.put(c,i);
            res = Math.max(res, i-j+1);    
        }
        
        return res;
    }
}