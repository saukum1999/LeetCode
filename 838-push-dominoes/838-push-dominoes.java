class Solution {
    public String pushDominoes(String dominoes) {
        
        int sz = dominoes.length();
        char prev = ' ';
        char prev2 = '.';
        int[] l = new int[sz];
        int[] r = new int[sz];
        
        for (int i = 0; i < sz; i++) {
            char ch = dominoes.charAt(i);
            if (ch == 'L')  r[i] = 0;
            else if (ch == 'R') r[i] = 0;
            else if (ch == '.') {
                if (prev == 'L') r[i] = 0;
                else if (prev == 'R') {r[i] = r[i - 1] + 1; ch = 'R';}
                else r[i] = 0;
            }
            prev = ch;
        }
        
        prev = ' ';
        for (int i = sz - 1; i >= 0; i--) {
            char ch = dominoes.charAt(i);
            if (ch == 'L')  l[i] = 0;
            else if (ch == 'R') l[i] = 0;
            else if (ch == '.') {
                if (prev == 'L') {l[i] = l[i + 1] + 1; ch = 'L';}
                else if (prev == 'R') l[i] = 0;
                else l[i] = 0;
            }
            prev = ch;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < sz; i++){
            if(l[i] == r[i]) sb.append(dominoes.charAt(i));
            else if(l[i] == 0 && r[i] != 0) sb.append('R');
            else if(l[i] != 0 && r[i] == 0) sb.append('L');
            else if(l[i] < r[i]) sb.append('L');
            else sb.append('R');
        }
        
        return sb.toString();
    }
}