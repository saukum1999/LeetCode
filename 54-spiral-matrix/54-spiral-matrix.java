class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> res = new ArrayList<>();
        if (m.length == 0 || m[0].length == 0)
            return res;
        int left = 0;
        int bottom = m.length - 1;
        int top = 0;
        int right = m[0].length - 1;

        while (true) {

            for (int i = left; i <= right; i++)
                res.add(m[top][i]);
            top++;
            if (left > right || top > bottom)
                break;

            for (int i = top; i <= bottom; i++)
                res.add(m[i][right]);
            right--;
            if (left > right || top > bottom)
                break;

            for (int i = right; i >= left; i--)
                res.add(m[bottom][i]);
            bottom--;
            if (left > right || top > bottom)
                break;

            for (int i = bottom; i >= top; i--)
                res.add(m[i][left]);
            left++;
            if (left > right || top > bottom)
                break;

        }
        return res;

    }
}