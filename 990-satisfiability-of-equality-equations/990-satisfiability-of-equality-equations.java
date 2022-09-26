class Solution{
    int[] uf = new int[26];
    public boolean equationsPossible(String[] equations) {
        for (int i = 0; i < 26; ++i) uf[i] = i;
        for (String e : equations)
            if (e.charAt(1) == '=')
                uf[find(e.charAt(0) - 'a')] = find(e.charAt(3) - 'a');
        for (String e : equations)
            if (e.charAt(1) == '!' && find(e.charAt(0) - 'a') == find(e.charAt(3) - 'a'))
                return false;
        return true;
    }

    public int find(int x) {
        if (x != uf[x]) uf[x] = find(uf[x]);
        return uf[x];
    }
}

// class Solution {
    
//     int[] parent = new int[128];
//     int[] rank = new int[128];
    
//     void makeSet(){
//         for(int i = 0; i < 128; i++){
//             parent[i] = i;
//             rank[i] = 0;
//         }
//     }
    
//     int findPar(int ch){
//         if(ch == parent[ch])
//             return ch;
        
//         return parent[ch] = findPar(parent[ch]);
//     }
    
//     void union (int a, int b){
//         if(rank[a] < rank[b]){
//             parent[a] = b;
//         }
//         else if(rank[a] > rank[b]){
//             parent[b] = a;
//         }
//         else{
//             parent[b] = a;
//             rank[a]++;
//         }
//     }
//     public boolean equationsPossible(String[] equations) {
        
//         char a = 0;
//         char b = 0;
//         for(String str : equations){
//             a = str.charAt(0);
//             b = str.charAt(3);
//             if(a == b)
//                 continue;
            
//             if(str.charAt(1) == '='){
//                 union(a, b);
//             }
            
//         }
        
//         for(String str : equations){
//             a = str.charAt(0);
//             b = str.charAt(3);
            
//             if(str.charAt(1) != '='){
//                 if(parent[a] == parent[b])
//                     return false;
//             }
//         }
//         return true;
        
//     }
// }