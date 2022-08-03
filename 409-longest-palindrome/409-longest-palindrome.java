class Solution {
    public int longestPalindrome(String s) {

        Set<Character> ch = new HashSet<>();
        int count = 0;

        for (Character character : s.toCharArray()) {
            if (ch.contains(character)) {
                ch.remove(character);
                count++;
            } else {
                ch.add(character);
            }
        }

        if (!ch.isEmpty())
            return count * 2 + 1;
        else
            return count * 2;

    }
}