class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> tmap = new HashMap<>();
        HashMap<Character, Integer> smap = new HashMap<>();

        int mcnt = 0;
        int len = t.length();
        int l = 0;
        int r = 0;
        String res = new String();

        // storing the character frequency of t string
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            tmap.put(ch, tmap.getOrDefault(ch, 0) + 1);
        }

        while(r < s.length()){
            //acquire
            if(mcnt < len){
                char ch = s.charAt(r);
                if(tmap.containsKey(ch) && smap.getOrDefault(ch, 0) < tmap.get(ch)){
                    mcnt++;
                    smap.put(ch, smap.getOrDefault(ch, 0) + 1);
                }
                else
                    smap.put(ch, smap.getOrDefault(ch, 0) + 1);
                r++;
            }
            // release
            while(mcnt >= len) {
                // result update
                if(res.length() == 0)
                    res = s.substring(l, r);
                else if(res.length() > r-l)
                    res = s.substring(l, r);
                
                char ch = s.charAt(l);
                l++;
                
                if(smap.get(ch) > 1)
                    smap.put(ch, smap.get(ch) - 1);
                else
                    smap.remove(ch);

                if(tmap.containsKey(ch) && smap.getOrDefault(ch, 0) < tmap.get(ch))
                    mcnt--;
            }
        }

        return res;

        // traverse s string and find

    }
}