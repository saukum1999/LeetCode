class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int len = p.length();
        List<Integer> list  = new ArrayList<>();
        
        if(s.length() < len)
            return list;
        int[] p_ch = new int[26];
        int[] s_ch = new int[26];
        
        for(int i = 0; i<len ; i++){
            p_ch[p.charAt(i) - 'a']++;
        }
        
        int a = 0;
        
        for(int j=0 ; j<s.length() ; j++){
            
            if(j-a <= len-1){
                s_ch[s.charAt(j)- 'a']++;
            }
            else if(j-a > len-1){
                s_ch[s.charAt(a++)- 'a']--;
                s_ch[s.charAt(j)- 'a']++;
            }
            
            if(j-a == len-1){
                if(compare(p_ch,s_ch))
                    list.add(a);
            }
        }
        return list;
        
    }
    
    public boolean compare(int[] a, int[] b){
        for(int i =0 ; i<a.length ; i++){
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
    
    
}