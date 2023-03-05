class Solution {
    public String longestCommonPrefix(String[] strs) {
        int last = strs.length - 1;
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        for(int i = 0; i < strs[0].length(); i++){
            if(strs[0].charAt(i) != strs[last].charAt(i))
                break;
            else{
                sb.append(strs[0].charAt(i));
            }
        }
        return sb.toString();
    }
}