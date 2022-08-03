// class Solution {
//     public int maxProfit(int[] prices) {
//          int maxProfit = Integer.MIN_VALUE;
//         int dif=0;
//         int a=0;
//         // int b=0;
        
//         for (int i =1; i<prices.length; i++){
            
//             dif = prices[i]-prices[a];
//             if( dif < 0)
//                 a=i;
//             else if ( dif > maxProfit )
//                 maxProfit = dif;
//         }
//         if (maxProfit <0)
//             return 0;
//         return maxProfit;
//     }
// }

class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length < 2)
            return 0;
        int max = 0;
        int a = prices[0];
        int b;

        for(int i=1;i<prices.length;i++){
            b= prices[i];
            if(b<a)
                a=b;
                max = Math.max(max,b-a);
        }

        return max;
    }
}