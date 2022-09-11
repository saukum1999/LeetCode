// class Solution {
//     public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        
//         int[][] map = new int[n][2];
        
//         for(int i = 0; i < n; i++){
//             map[i] = {speed[i], efficiency[i]};
//         }
//         Arrays.sort(map,(a,b)-> b[1] - a[1] );
        
//         PriorityQueue<Integer> que = new PriorityQueue<>((a,b)-> a - b);
            
//         for(int i = 0; i < n; i++){
//             int temp = 0;
//             if(que.size() >= k){
//                 temp = que.poll();
//             }
            
//             que.add(map[i][0])
//         }
//     }
// }

class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] ess = new int[n][2];
        for (int i = 0; i < n; ++i)
            ess[i] = new int[] {efficiency[i], speed[i]};
        Arrays.sort(ess, (a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
        long res = 0, sumS = 0;
        for (int[] es : ess) {
            pq.add(es[1]);
            sumS = (sumS + es[1]);
            if (pq.size() > k) sumS -= pq.poll();
            res = Math.max(res, (sumS * es[0]));
        }
        return (int) (res % (long)(1e9 + 7));
    }
}