class Solution {
    public int countOdds(int low, int high) {
        int num = (high - low) / 2 ;
        if(low % 2 == 1 || high % 2 == 1)
            num++;
        
        return num;
    }
}