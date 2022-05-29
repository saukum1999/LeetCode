class Solution {
    public boolean isValid(String s) {
         if (s == null || s.length() == 0 || s.length() % 2 != 0) {
            return false;
        }
        
        char[] char_arr = s.toCharArray();
        Stack<Character> stk = new Stack<>();

        for (Character ch : char_arr) {
            if( (ch == '}' && stk.isEmpty()) || (ch == ']' && stk.isEmpty()) || (ch == ')' && stk.isEmpty()) )
                return false;
            
            if (ch == '{')
                stk.push(ch);
            else if (ch == '}' && stk.peek() == '{') {
                stk.pop();
            } else if (ch == '[') {
                stk.push(ch);
            } else if (ch == ']' && stk.peek() == '[') {
                stk.pop();
            } else if (ch == '(') {
                stk.push(ch);
            } else if (ch == ')' && stk.peek() == '(') {
                stk.pop();
            } else {
                return false;
            }
        }

        if (stk.isEmpty())
            return true;
        else
            return false;
    }
}