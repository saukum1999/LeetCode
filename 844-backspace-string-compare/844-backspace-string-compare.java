class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        // Stack<Character> stk_s = new Stack<>();
        // StringBuilder s1 = new StringBuilder();
        // StringBuilder t1 = new StringBuilder();
        
        String s1 = newString(s);
        String t1 = newString(t);
        
        if(s1.equals(t1))
            return true;
        
        return false;
        
        
    
    }
    
    public String newString(String a){
        Stack<Character> stk = new Stack<>();
        StringBuilder s1 = new StringBuilder();
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == '#' && !stk.isEmpty()){
                stk.pop();
            }
            else if(a.charAt(i) != '#')
                stk.push(a.charAt(i));
        }
        
        while(!stk.isEmpty()){
            s1.append(stk.pop());
        }
        
        return s1.toString();
    }
}