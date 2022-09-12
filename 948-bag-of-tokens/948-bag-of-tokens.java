// class Solution {
//     public int bagOfTokensScore(int[] tokens, int power) {
        
//         if(tokens.length == 1){
//             return (power / tokens[0]);
//         }
//         Arrays.sort(tokens);
//         int l = 0;
//         int r = tokens.length;
//         int res = 0;
//         int score = 0;
        
//         while(l<=r){
//             if(power >= tokens[l]){
//                 score++;
//                 power -= tokens[l];
//                 l++;
//             }
//             else if(power < tokens[l] && score > 0){
//                 power += tokens[--r];
//                 score--;
//                 // r--;
//             }
//             else{
//                 res = Math.max(res, score);
//                 break;
//             }
//             System.out.println(res + " " + score);
//             res = Math.max(res, score);
//         }
        
//         return res;
        
//     }
// }

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        int res=0;
        
        int l=0, r=tokens.length-1,score=0;
        
        while(l<=r){
            if(power<tokens[l]){
                if(score>0){
                    power+=tokens[r--];
                    score--;
                }else{
                    return res;
                }
            }else{
                power-=tokens[l++];
                score++;
                res = Math.max(score,res);
            }
        }
        
        return res;
    }
}