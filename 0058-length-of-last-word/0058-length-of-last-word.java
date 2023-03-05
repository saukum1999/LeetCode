class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int i = words.length - 1;
        while(i >= 0){
            if(!words[i].equals(" "))
                return words[i].length();
        }
        return 0;
    }
}