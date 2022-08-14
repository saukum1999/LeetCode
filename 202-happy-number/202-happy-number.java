class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n))
                return false;
            set.add(n);
            int res = 0;
            while (n > 0) {
                int a = n % 10;
                n = n / 10;
                res += a * a;
            }
            n = res;
        }
        return true;
    }
}