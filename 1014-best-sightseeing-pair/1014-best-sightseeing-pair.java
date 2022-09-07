class Solution {
    public int maxScoreSightseeingPair(int[] A) {
        int sum_i = A[0] + 0;
        int score = 0;
        int len = A.length;
        
        
        for(int i = 1; i < len; i++){
            score = Math.max(score, sum_i + A[i] - i);
            sum_i = Math.max(sum_i, A[i] + i);
        }
        return score;

    }
}