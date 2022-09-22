class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();        
        for(int i = 0; i < str.length; i++){
            StringBuilder sbn = new StringBuilder(str[i]).reverse();
            if(i == str.length - 1 )
                sb.append(sbn);
            else
                sb.append(sbn + " ");
        }
        
        return sb.toString();
    }
}