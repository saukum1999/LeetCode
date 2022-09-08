class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[][] after = new int[2][3];
        int[][] cur = new int[2][3];

        for (int i = len - 1; i >= 0; i--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int c = 2; c > 0; c--) {
                    if (buy == 1) {
                        cur[buy][c] = Math.max(-prices[i] + after[0][c], 0 + after[1][c]);
                    } else {
                        cur[buy][c] = Math.max(prices[i] + after[1][c - 1], 0 + after[0][c]);
                    }
                }
                after = cur;
            }
        }

        return cur[1][2];

    }

}