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
    public TreeNode pruneTree(TreeNode root) {
        dfs(root);
        if(root.left == null && root.right == null && root.val != 1)
            return null;
        
        return root;
        
    }
    
    public int dfs(TreeNode root){
        if(root == null)
            return 0;
        int ret = 0;
        if(root.val == 1)
            ret = 1;
        
        if(dfs(root.left) == 1)
            ret = 1;
        else
            root.left = null;
        if(dfs(root.right) == 1)
            ret = 1;
        else
            root.right = null;
                
        return ret;
        
        
    }
}