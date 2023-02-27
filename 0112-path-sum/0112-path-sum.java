/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;
        return dfs(root, targetSum, 0);
    }
    public boolean dfs(TreeNode root, int targetSum, int cur_sum){
        boolean l = false;
        boolean r = false;
        if(root.left == null && root.right == null){
            cur_sum += root.val;
            if(cur_sum == targetSum){
                return true;
            } 
            else
                return false;
        }
        cur_sum += root.val;
        if(root.left != null)
            l = dfs(root.left, targetSum, cur_sum);
        if(root.right != null)
            r = dfs(root.right, targetSum,  cur_sum);
        return ( l || r);
    }
}