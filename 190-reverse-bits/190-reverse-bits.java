public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        boolean issigned = false;
        
        if( n < 0)
            issigned =true;
        int a =31;
        
        while(a-- > 0){
            res |= (n & 1);
            n = n >> 1;
            res = res << 1;
        }
        
        if(issigned)
        return res + 1;
        
        return res;
        
    }
}