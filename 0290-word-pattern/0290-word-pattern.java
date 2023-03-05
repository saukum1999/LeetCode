class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length)
            return false;
        HashSet<String> set = new HashSet<>();
        HashMap<Character, String> map = new HashMap<>(); 
        for(int i = 0; i < words.length; i++){
            if(map.containsKey(pattern.charAt(i)) && !words[i].equals(map.get(pattern.charAt(i))) )
                return false;
            else if(!map.containsKey(pattern.charAt(i)) && set.contains(words[i]))
                return false;
            else {
                set.add(words[i]);
                map.put(pattern.charAt(i), words[i]);
            }
        }
        return true;
    }
}