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
    
    public static int dia;    
    public int diameterOfBinaryTree(TreeNode root) {
        dia = 0;
        depth(root);
        return dia;
    }
    
    public int depth(TreeNode root){
        if(root == null)
            return 0;
        
        int lh = depth(root.left);
        int rh = depth(root.right);
        
        dia = Math.max(dia, lh+rh);
        
        return Math.max(lh,rh)+1;
    }
}