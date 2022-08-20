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
    
    // public static int dia;    
    public int diameterOfBinaryTree(TreeNode root) {
        int[] dia = new int[1];
        depth(root, dia);
        return dia[0];
    }
    
    public int depth(TreeNode root, int[] dia){
        if(root == null)
            return 0;
        
        int lh = depth(root.left,dia);
        int rh = depth(root.right,dia);
        
        dia[0] = Math.max(dia[0], lh+rh);
        
        return Math.max(lh,rh)+1;
    }
}