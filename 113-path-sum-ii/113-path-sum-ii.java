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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return res;
        dfs(root, 0, targetSum, new ArrayList<Integer>());
        
        return res;
        
    }
    public void dfs(TreeNode root, int sum, int target, List<Integer> lst){

        if(root.left == null && root.right == null){
            if(sum + root.val == target){
                lst.add(root.val);
                res.add(lst);
            }            
            return;
        }
        
        sum += root.val;
        lst.add(root.val);
        
        if(root.left != null )
            dfs(root.left, sum, target, new ArrayList<Integer>(lst));
            
        if(root.right != null)
            dfs(root.right, sum, target, new ArrayList<Integer>(lst));
        return ;
        
    }
}