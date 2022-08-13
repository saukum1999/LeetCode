class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        List<String> res = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        PriorityQueue<String> top = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                if(map.get(a) == map.get(b))
                    return a.compareTo(b);
                else
                    return map.get(b) - map.get(a);
            }
        });
        
        top.addAll(map.keySet());
        
        for(int i=0; i<k;i++){
            res.add(top.poll());
        }
     
        return res;
    }
}