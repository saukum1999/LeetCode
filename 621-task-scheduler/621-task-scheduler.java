class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int[] freq = new int[26];
        int grp_size = 0;
        for(int i=0; i<tasks.length; i++){
            freq[tasks[i] - 'A']++;
        }
        int max = 0;
        
        for(int i = 0 ; i<26;i++){
            if( max < freq[i]){
                max = freq[i];
                grp_size = 0;
            }
            if(freq[i] == max)
            grp_size++;
        }
        
        return Math.max(tasks.length,(n+1)*(max-1)+grp_size);
        
    }
}