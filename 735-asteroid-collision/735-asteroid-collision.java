class Solution {
    

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int el:asteroids){
            if(stack.isEmpty() || el>0){
                stack.push(el);
                continue;
            }
          while(!stack.isEmpty() && stack.peek()>0 && el+stack.peek()<0) stack.pop();
              
          if(stack.isEmpty() || (stack.peek()<0 && el<0)) stack.push(el);
          else if(el+stack.peek()==0) stack.pop();
                
        }
        int n=stack.size();
        int [] res=new int[n];
        for(int i=n-1;i>=0;i--){
            res[i]=stack.pop();
        }
        return res;
            
    }

    
//     public int[] asteroidCollision(int[] asteroids) {

//         Stack<Integer> stk = new Stack<>();

//         for (int a : asteroids) {
//             if (!stk.isEmpty()) {
//                 if ((stk.peek() < 0 && a > 0) || (stk.peek() < 0 && a < 0) || (stk.peek() > 0 && a > 0)) {
//                     stk.push(a);
//                 } else if (stk.peek() > 0 && a < 0) {
                    
//                     if (Math.abs(stk.peek()) < Math.abs(a)) {
//                         stk.pop();
//                         while(!stk.isEmpty() && ((stk.peek() > 0 && a < 0) && (Math.abs(stk.peek()) < Math.abs(a)) ))
//                             stk.pop();
//                         stk.push(a);
//                     } else if (Math.abs(stk.peek()) == Math.abs(a))
//                         stk.pop();
//                     else
//                         continue;
//                 }
//             } else
//                 stk.push(a);

//         }

//         int[] ar = new int[stk.size()];
//         int i = ar.length -1;

//         while (!stk.isEmpty()) {
//             ar[i--] = stk.pop();
//         }

//         return ar;

//     }
}