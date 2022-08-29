import java.util.HashMap;

class Solution {
    public String minWindow(String s1, String s2) {


        String res =new String();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s2.length(); i++) {
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        int mct = 0;
        int dmct = s2.length();
        int i = -1;
        int j = -1;

        while (true) {
        boolean flag1 = false;
        boolean flag2 = false;

            // aquire
            while (i < s1.length() - 1 && mct < dmct) {
                i++;
                char ch = s1.charAt(i);
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);

                if (map1.getOrDefault(ch, 0) <= map2.getOrDefault(ch, 0))
                    mct++;
                flag1 = true;
            }

            // release and collect answers
            while(j < i && mct == dmct){
                String pans = s1.substring(j+1, i+1);
                if(res.length() == 0 || pans.length() < res.length())
                    res = pans;

                j++;
                char ch = s1.charAt(j);
                if(map1.get(ch) == 1)
                    map1.remove(ch);
                else
                    map1.put(ch, map1.get(ch) - 1);

                if(map1.getOrDefault(ch, 0) < map2.getOrDefault(ch, 0))
                    mct--;
                flag2 = true;
            }

            if(!flag1 && !flag2)
                break;

        }

        return res;

    }
}