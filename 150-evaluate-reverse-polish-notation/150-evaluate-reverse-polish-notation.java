class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int a = st.pop(), b = st.pop(), c = 0;
                if(s.equals("+")){
                    c = b+a;
                }
                else if(s.equals("-")){
                    c = b-a;
                }
                else if(s.equals("*")){
                    c = b*a;
                }
                else if(s.equals("/")){
                    c = b/a;
                }
                st.push(c);
            }
            else{
                int curr = Integer.parseInt(s);
                st.push(curr);
            }
        }
        return st.pop();
    }
}