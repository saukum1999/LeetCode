class Solution {
    
    public int nextNum(int n){
        int res = 0;
        while(n>0){
            int a = n%10;
            n = n/10;
            res = res + a*a;
        }
        return res;
    }
    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while(n!=1){
            n = nextNum(n);
            if(set.contains(n))
                return false;
            else
                set.add(n);
        }
                    // if(n==1)
                return true;

    }
}