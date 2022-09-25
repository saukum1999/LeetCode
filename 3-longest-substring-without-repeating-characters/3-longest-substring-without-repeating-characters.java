class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        int i = 0;
        int j = 0;
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for(; j < s.length(); j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
            map.put(s.charAt(j),j);
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}