class Solution {
    public boolean backspaceCompare(String S, String T) {

        int i = S.length() - 1;
        int j = T.length() - 1;
        int skip_s = 0;
        int skip_t = 0;

        while (i >= 0 || j >= 0) {

            while (i >= 0) {
                if (S.charAt(i) == '#') {
                    skip_s++;
                    i--;
                } else if (skip_s > 0) {
                    skip_s--;
                    i--;
                } else
                    break;
            }

            while (j >= 0) {
                if (T.charAt(j) == '#') {
                    skip_t++;
                    j--;
                } else if (skip_t > 0) {
                    skip_t--;
                    j--;
                } else
                    break;
            }

            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;

            if ((i >= 0) != (j >= 0))
                return false;
            i--;
            j--;
        }
        return true;
    }
}