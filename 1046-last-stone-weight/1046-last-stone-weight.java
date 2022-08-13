class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<stones.length; i++){
            maxHeap.add(stones[i]);
        }
        
        while(maxHeap.size()>1){
            int a = maxHeap.poll();
            int b = maxHeap.poll();

            if( a>b){
                maxHeap.add(a-b);
            }
            else if(b>a)
                maxHeap.add(b-a);
        }
        
        if (maxHeap.size() > 0)
            return maxHeap.poll();
        else
            return 0;
    }
}