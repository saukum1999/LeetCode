class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> str = new HashSet<>(); 
        // String a = "cab";
        
        for(int i=0; i<words.length; i++)
        str.add(decode(code, words[i]));
        
        // System.out.println(b);
        
        return str.size();
        
    }
    
    public String decode(String[] code, String phrase){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<phrase.length(); i++){
            sb.append(code[phrase.charAt(i) - 'a']);
        }
        return sb.toString();
    }
}