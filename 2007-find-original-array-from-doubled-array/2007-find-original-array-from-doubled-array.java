class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length % 2 == 1)
            return new int[0];
        
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(changed);
        for(int a : changed){
            map.put(a,map.getOrDefault(a,0) + 1);
        }
        int[] res = new int[changed.length/2];
        int count = 0;
        for(int i = 0; i < changed.length; i++){
            if(map.getOrDefault(changed[i],0) > 0){
                if(map.getOrDefault(changed[i] * 2,0) > 0){
                    map.put(changed[i], map.get(changed[i]) - 1);
                    map.put(changed[i]*2, map.get(changed[i]*2) - 1);
                    res[count++] = changed[i];
                }
                else
                    return new int[0];
            }
            
        } 
        return res;
    }
}