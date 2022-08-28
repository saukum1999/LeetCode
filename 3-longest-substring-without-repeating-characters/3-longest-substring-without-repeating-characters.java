class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(r = 0; r < s.length(); r++){
            char ch = s.charAt(r);
            if(map.containsKey(ch))
                l = Math.max(l,map.get(ch)+1);
            map.put(ch,r);
            count = Math.max(count, r-l+1);
        }
        return count;
    }
}