class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        int res = 0;
        int next = 0;
        int prev = 0;
        for(int i = 0; i < fb.length; i++){
            next = (i == fb.length - 1) ? 0 : fb[i + 1];
            prev = (i == 0) ? 0 : fb[i - 1];
            if(fb[i] == 0 && next == 0 && prev == 0){
                fb[i] = 1;
                res++;
            }
        }
        return res >= n;
    }
}