class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();

        helper(1, n, k, ans, lst);

        return ans;
    }

    public void helper(int j, int n, int k, List<List<Integer>> ans, List<Integer> lst) {
        if (k==0) {
            ans.add(new ArrayList<>(lst));
            return;
        }

        for (int i = j; i <= n-k+1; i++) {

            lst.add(i);
            helper(i + 1, n, k-1, ans, lst);
            lst.remove(lst.size() - 1);
        }

    }
}