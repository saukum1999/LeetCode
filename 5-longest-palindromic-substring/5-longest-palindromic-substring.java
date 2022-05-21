class Solution {
    int lo;
    int len;    
    
    public String longestPalindrome(String s) {
    
        // int i=0;
        if( s.length() <2 )
            return s;
        
        for(int i=0 ; i<s.length()-1 ; i++){
            palindrome(s, i, i);
            palindrome(s,i,i+1);
            // i++;
        }
        
        return s.substring(lo,lo+len);
            
    
    }
    
    public void palindrome(String s, int l, int k){
        
        while(l>=0 && k<s.length() && (s.charAt(l) == s.charAt(k))){
                l--;
                k++;
            
        }
        if(len < k-l-1){
        lo = l+1;
        len = k-l-1;
        }
    }
}