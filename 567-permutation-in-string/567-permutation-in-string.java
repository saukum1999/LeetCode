class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s2.length() < s1.length())
            return false;
        
        int[] s1ch = new int[26];
        int[] s2ch = new int[26];
        
        int l1 = s1.length();
        int l2 = s2.length();
        for(int i =0; i<l1 ; i++){
            s1ch[s1.charAt(i)-'a']++;
            s2ch[s2.charAt(i)-'a']++;
        }
        
        for(int i = 0; i < (l2 - l1); i++){
            if(match(s1ch, s2ch))
                return true;
            s2ch[s2.charAt(i + l1) - 'a']++;
            s2ch[s2.charAt(i)-'a']--;
        }
        
        return match(s1ch,s2ch);
        
    }
    
    public boolean match(int[] s1, int[] s2){
        for(int i=0; i<26;i++){
            if(s1[i] != s2[i])
                return false;
        }
        return true;
    }
    
}