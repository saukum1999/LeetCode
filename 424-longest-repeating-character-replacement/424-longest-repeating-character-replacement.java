class Solution {
    public int characterReplacement(String s, int k) {
        
        int count = 0;
        int[] ch = new int[26];
        int start=0;
        int max = 0;
        for(int end = 0; end<s.length(); end++){
            char c= s.charAt(end);
            ch[c - 'A']++;
            max = Math.max(max, ch[c-'A']);
            
            while(end-start+1-max >k){
                ch[s.charAt(start)-'A']--;
                start++;
            }
                
                
                count = Math.max(count, end-start+1);
        }
     
        return count;
    }
}