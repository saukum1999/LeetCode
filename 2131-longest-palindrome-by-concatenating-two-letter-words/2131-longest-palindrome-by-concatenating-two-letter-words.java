class Solution{
public int longestPalindrome(String[] words) {
    int counter[][] = new int[26][26];
    int ans = 0;
    for (String w: words) {
        int a = w.charAt(0) - 'a', b = w.charAt(1) - 'a';
        if (counter[b][a] > 0) {
            ans += 4; 
            counter[b][a]--; 
        }
        else counter[a][b]++;
    }
    for (int i = 0; i < 26; i++) {
        if (counter[i][i] > 0) {
            ans += 2;
            break;
        }
    }
    return ans;
}
}



// class Solution {
//     public int longestPalindrome(String[] words) {
        
//         int count = 0;
//         HashSet<String> set = new HashSet<>();
//         boolean same = false;
//         boolean sinc = false;
//         for(String s: words){
//             StringBuilder sb = new StringBuilder(s);
//             if(s.charAt(0) == s.charAt(1)){
//                 same = true;
//             }
            
//             if(set.contains(s)){
//                 if(same){
//                     count+=2;
//                     sinc = false;
//                     same = false;
//                 }
//                 count+=4;
//                 set.remove(s);
//             }
//             else{
//                 if(same && !sinc){
//                     count+=2;
//                     sinc = true;
//                 }
//                 set.add(sb.reverse().toString());
//             }
//         }
//         return count;
//     }
// }