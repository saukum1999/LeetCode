class Solution {
    public String reverseWords(String s) {
        int start=0;
        int end = 0;
        char[] s_ch = s.toCharArray();
        while(end<s_ch.length){
            
            if(s_ch[end] ==' '){
                reverse(s_ch,start, end-1);
                start = end+1;
                end  = end+1;
            }
            else if(end == s.length()-1)
                reverse(s_ch,start, end);
            
            end++;                
        }
              return new String(s_ch);
    }
    
    public void reverse(char[] s, int start, int end){
        
        while(start<end){
            char temp = s[start];
            s[start]= s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}