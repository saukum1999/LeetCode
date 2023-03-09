class Solution {
    public int countValidWords(String sentence) {
        sentence = sentence.trim().replaceAll(" +", " ");
        String[] words = sentence.split(" ");
        int res = 0;
        for(String word : words){
            if(word != " " && valid(word)){
                res++;
                System.out.println(word);
            }
        }
        return res;
    }
    
    public boolean valid(String s){
        int hypen = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if((i == 0 || i == s.length() - 1) && ch == '-')
                return false;
            else if(ch == '-'){
                if(hypen != 0)
                    return false;
                hypen++;
            }
            else if(i != s.length() - 1 && (ch == '!' || ch == '.' || ch == ','))
                return false;
            else if(i == s.length() - 1 && (ch == '!' || ch == '.' || ch == ',') && i - 1 > 0 && s.charAt(i -1) == '-')
                return false;
            else if(Character.isDigit(ch) || Character.isUpperCase(ch))
                return false;
        }
        return true;
    }
}